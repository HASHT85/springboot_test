package fr.yololaxe.webtest.repository;

import fr.yololaxe.webtest.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
