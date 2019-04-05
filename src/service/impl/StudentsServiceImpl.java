package service.impl;

import model.Course;
import model.Marks;
import model.Student;
import repository.StudentsRepository;
import repository.impl.StudentsRepositoryImpl;
import service.StudentsService;


import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class StudentsServiceImpl implements StudentsService {

    private StudentsRepository studentsRepository = new StudentsRepositoryImpl();

    @Override
    public List<Student> getStudents() {
        return studentsRepository.getStudents();
    }

    @Override
    public void addStudents(Student student) {
        studentsRepository.addStudents(student);

    }


    @Override
    public double averageMarks(Student student) {
        return (student.getMarks().stream()
                .mapToInt(Marks::getMarks)
                .average()
                .orElse(0));
    }

    @Override
    public int countCourseInDays(Student student) {
        int totalHours = student.getCurriculum().
                getCourses()
                .stream()
                .mapToInt(Course::getCourseHours)
                .sum();

        int workingHoursInADay = 8;

        return totalHours / workingHoursInADay;
    }

    @Override
    public void isBadStudent(Student student) {
        if (upDrop(student ) < 4.5){
            student.setStatus("отчислить");
        }

    }

    @Override
    public List<Student> getSortedBadStudents(List<Student> students) {
        for (Student student :students
             ) {
            isBadStudent(student);

        }
        return students;
    }

    @Override
    public List<Student> getSortedAverageMarks(List<Student> students) {
        return students
                .stream()
                .sorted(Comparator.comparingDouble(this::upDrop))
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> getSortedDaysToEnd(List<Student> students) {
        return students
                .stream()
                .sorted(Comparator.comparingInt(this::countDaysToEnd))
                .collect(Collectors.toList());
    }


    @Override
    public int countDaysToEnd(Student student) {

        return countCourseInDays(student) - student.getMarks().size() ;
    }

    @Override
    public double upDrop(Student student) {
        double sumMarks = student
                .getMarks()
                .stream()
                .mapToInt(Marks::getMarks)
                .sum();
        return ((sumMarks + 5 * countDaysToEnd(student))/ countCourseInDays(student));

    }



}
