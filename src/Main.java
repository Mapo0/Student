
import service.StudentsService;



public class Main {
    private static Generator generator = new Generator();

    public static void main(String[] args) {
        StudentsService studentsService =generator.getStudentsService();

        System.out.println(studentsService.getStudents().get(0));
        System.out.println("средняя оценка:"+ " "+studentsService.averageMarks(studentsService.getStudents().get(0)));
        System.out.println("время обучения:"+" "+studentsService.countCourseInDays(studentsService.getStudents().get(0)));
        System.out.println("дней до конца:"+ " "+studentsService.countDaysToEnd(studentsService.getStudents().get(0)));
        System.out.println("статус студента:" + " "+studentsService.upDrop(studentsService.getStudents().get(0)));



    }
}
