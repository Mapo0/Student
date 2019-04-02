package service.impl;

import model.Course;
import model.Marks;
import model.Student;
import repository.StudentsRepository;
import repository.impl.StudentsRepositoryImpl;
import service.StudentsService;

import java.util.List;

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
        return Math.round(student.getMarks().stream()
                .mapToInt(Marks::getMarks)
                .average()
                .orElse(0));
    }

    @Override
    public int timeToEnd(Student student) {
        return durationCourse(student)-student.getMarks().size() ;
    }

    @Override
    public void upDrop(Student student) {

    }

    @Override
    public int durationCourse(Student student) {
        int duration =0;
        for (Course course : student.getCurriculum().getCourses()) {
        duration +=course.getCoursetime();
        }
        return duration/8;
    }


}
