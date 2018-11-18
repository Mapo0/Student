package service.impl;

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
    public void middleMarks(Student student) { studentsRepository.getStudents().get(1);

    }

}
