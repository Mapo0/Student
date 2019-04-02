package service;

import model.Student;

import java.util.List;

public interface StudentsService {

    List<Student> getStudents();

    void addStudents(Student student);

    double averageMarks (Student student);

   public int timeToEnd (Student student);

    void upDrop (Student student);

    public int durationCourse (Student student);
}
