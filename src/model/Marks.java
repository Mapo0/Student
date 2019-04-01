package model;



public enum  Marks {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);
    private final int marks;


    public int getMarks() {
        return marks;
    }

    Marks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Оценка: " + marks;
    }
}


