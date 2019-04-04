
import service.StudentsService;



public class Main {
    private static Generator generator = new Generator();

    public static void main(String[] args) {

        StudentsService studentsService =generator.getStudentsService();


        studentsService.getFilterGoodStudents(studentsService.getStudents()).forEach(System.out :: println);

        System.out.println("Список студентов отсортированный , что не будут отчислены:");
        studentsService.getFilterGoodStudents(studentsService.getStudents()).forEach(System.out::println);

        System.out.println("Список студентов отсортированных по cредней оценке:");
        studentsService.getFilterAverageMarks(studentsService.getStudents()).forEach(System.out :: println);

        System.out.println("Список студентов отсортированных по дням до конца обуче6ния:");
        studentsService.getFilterDaysToEnd(studentsService.getStudents()).forEach(System.out::println);



    }
}
