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

    void isBadStudent(Student student);

    List<Student> getSortedBadStudents(List<Student> students);

    List<Student> getSortedAverageMarks (List<Student> students);

    List<Student> getSortedDaysToEnd (List<Student> students);


}
