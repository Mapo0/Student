import model.CURRICULUM;
import model.Course;
import model.MARK;
import model.Student;
import service.CourseService;
import service.CurriculumService;
import service.StudentsService;
import service.impl.CourseServiceImpl;
import service.impl.CurriculumServiceImpl;
import service.impl.StudentsServiceImpl;
import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    private static CourseService courseService ;
    private static CurriculumService curriculumService = new CurriculumServiceImpl();
    private static StudentsService studentsService = new StudentsServiceImpl();

    static  {
        courseService = new CourseServiceImpl();

        //добавляем курсы
        courseService.addCourse(new Course("Технология Java Servlets",16));
        courseService.addCourse(new Course("Struts Framework",24));
        courseService.addCourse(new Course("Spring Framework",32));
        courseService.addCourse(new Course("Hibernate",8));

        // учебный план J2EE Developer
        curriculumService.newCurricula(new CURRICULUM(" J2EE Developer", LocalDate.now(),courseService.getCourses()));

        courseService = new CourseServiceImpl();

        //добавляем курсы
        courseService.addCourse(new Course("Обзор технологий Java",8));
        courseService.addCourse(new Course("Библиотека JFC/Swing",16));
        courseService.addCourse(new Course("Технология JDBC",32));
        courseService.addCourse(new Course("Технология JAX",24));
        courseService.addCourse(new Course("Библиотеки commons",8));

        // учебный план Java Developer
        curriculumService.newCurricula(new CURRICULUM(" Java Developer", LocalDate.now(),courseService.getCourses()));

        // создаем лист студентов
        studentsService.addStudents(new Student("Коля Петров", "отчислен",Arrays.asList(new MARK(1),new MARK(3),new MARK(5),new MARK(5)),curriculumService.getCurricula().get(0)));
        studentsService.addStudents(new Student("Иван Иванов", "обучается",Arrays.asList(new MARK(1),new MARK(5)),curriculumService.getCurricula().get(1)));
        studentsService.addStudents(new Student("Вася Кузнецов", "отчислен",Arrays.asList(new MARK(5),new MARK(3),new MARK(5)),curriculumService.getCurricula().get(1)));

        // средний балл студента

    }



    public static void main(String[] args) {

        System.out.print(studentsService.getStudents().toString());

    }
}
