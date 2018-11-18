package service;

import model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();

    void addCourse(Course course);
}
