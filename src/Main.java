
import service.StudentsService;



public class Main {
    private static Generator generator = new Generator();

    public static void main(String[] args) {
        StudentsService studentsService =generator.getStudentsService();


        studentsService.getFilterGoodStudents(studentsService.getStudents()).forEach(System.out :: println);



    }
}
