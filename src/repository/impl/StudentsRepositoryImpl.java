package repository.impl;

import model.Student;
import repository.StudentsRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepositoryImpl implements StudentsRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void addStudents(Student student) {
        students.add(student);
    }

    @Override
    public void updateStatusStudent(Student student) {
        student.setStatus("Отчислить");
    }

}
