package fr.yololaxe.webtest.controller;

import fr.yololaxe.webtest.model.Student;
import fr.yololaxe.webtest.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Optional<Student> student = service.getStudent(id);
        return student.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        if (!service.getStudent(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        student.setId(id);
        return ResponseEntity.ok(service.saveStudent(student));
    }
}
