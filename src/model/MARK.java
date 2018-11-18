package model;

import java.util.List;

public class MARK {
    private int marks;

    public MARK() {
    }

    public MARK(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Оценка: " + marks;
    }
}
