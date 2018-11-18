package repository;

import model.Student;

import java.util.List;

public interface StudentsRepository {

    List<Student> getStudents();

    void addStudents(Student student);
}
