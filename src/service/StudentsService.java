package service;

import model.Student;

import java.util.List;

public interface StudentsService {
    List<Student> getStudents();

    void addStudents(Student student);

    void middleMarks(Student student);
}
