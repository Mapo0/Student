package model;

public class Course {
    private String coursename;
    private int coursetime;

    public Course() {

    }

    public Course(String coursename, int coursetime) {
        this.coursename = coursename;
        this.coursetime = coursetime;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCourseHours() {
        return coursetime;
    }

    public void setCoursetime(int coursetime) {
        this.coursetime = coursetime;
    }

    @Override
    public String toString() {
        return " Курс: " + coursename + " Часов: " + coursetime;
    }
}
