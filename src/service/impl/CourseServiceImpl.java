package service.impl;

import model.Course;
import repository.CourseRepository;
import repository.impl.CourseRepositoryImpl;
import service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository = new CourseRepositoryImpl();

    @Override
    public List<Course> getCourses() {
        return courseRepository.getCourses();
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.addCourse(course);
    }

}
