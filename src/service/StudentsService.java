package service;

import model.Student;

import java.util.List;

public interface StudentsService {

    List<Student> getStudents();

    void addStudents(Student student);

    double averageMarks(Student student);

    int countDaysToEnd(Student student);

    double upDrop(Student student);

    int countCourseInDays(Student student);

   boolean isGoodStudent (Student student);

    List<Student> getFilterGoodStudents (List<Student> students);


}
