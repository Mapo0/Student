package repository.impl;

import model.Course;
import repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {
    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

}
