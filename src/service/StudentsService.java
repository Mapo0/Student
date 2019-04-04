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

    void isGoodStudent(Student student);

    List<Student> getFilterGoodStudents(List<Student> students);

    List<Student> getFilterAverageMarks (List<Student> students);

    List<Student> getFilterDaysToEnd (List<Student> students);


}
