package model;

import service.impl.StudentsServiceImpl;

import java.text.DecimalFormat;
import java.util.List;

public class Student {
    private String fio ;
    private String status;
    private List<Marks> marks;
    private CURRICULUM curriculum;

    DecimalFormat df = new DecimalFormat("#.##");

    public Student(String fio, CURRICULUM curriculum, List<Marks> marks, String status) {
        this.fio = fio;
        this.status = status;
        this.marks = marks;
        this.curriculum = curriculum;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Marks> getMarks() {
        return marks;
    }

    public void setMarks(List<Marks> marks) {
        this.marks = marks;
    }

    public CURRICULUM getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(CURRICULUM curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Имя: " + fio + " Статус студента: "  + getStatus() + " средняя оценка: "
                + df.format(new StudentsServiceImpl().upDrop(this))
                + " дней до конца обучения: "
                + new StudentsServiceImpl().countDaysToEnd(this) ;
    }


}
