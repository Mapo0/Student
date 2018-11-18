package model;


import java.time.LocalDate;

import java.util.List;

public class CURRICULUM {
    private String CURRICULUMname;
    private LocalDate startdate;
    private List<Course> courses;

    public CURRICULUM() {
    }

    public CURRICULUM(String CURRICULUMname, LocalDate startdate, List<Course> courses) {
        this.CURRICULUMname = CURRICULUMname;
        this.startdate = startdate;
        this.courses = courses;
    }

    public String getCURRICULUMname() {
        return CURRICULUMname;
    }

    public void setCURRICULUMname(String CURRICULUMname) {
        this.CURRICULUMname = CURRICULUMname;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "" + CURRICULUMname + " Дата начала: " + startdate + " Курсы: " + courses;

    }
}
