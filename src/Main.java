
import service.StudentsService;



public class Main {
    private static Generator generator = new Generator();

    public static void main(String[] args) {
        StudentsService studentsService =generator.getStudentsService();
        System.out.println(studentsService.getStudents());
    }
}
