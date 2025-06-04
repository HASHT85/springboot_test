package fr.yololaxe.webtest.service;

import fr.yololaxe.webtest.model.Student;
import fr.yololaxe.webtest.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Iterable<Student> getStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudent(Long id) {
        return repository.findById(id);
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
