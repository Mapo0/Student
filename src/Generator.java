import model.CURRICULUM;
import model.Course;
import model.Marks;
import model.Student;
import service.CourseService;
import service.CurriculumService;
import service.StudentsService;
import service.impl.CourseServiceImpl;
import service.impl.CurriculumServiceImpl;
import service.impl.StudentsServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private StudentsService studentsService = new StudentsServiceImpl();
    private CourseService courseService = new CourseServiceImpl();
    private CurriculumService curriculumService = new CurriculumServiceImpl();

    private static final String [] studentName ={"Marat","Jeka","Vova", "Maksim","Kira"};
    private static final String [] courseName = {"Технология Java Servlets","Struts Framework","Spring Framework","Hibernate","JDBC","JAXB","Обзор технологий Java","Библиотеки commons","Библиотека JFC/Swing"};
    private static final String [] curriculumName = {" J2EE Developer"," Java Developer"};

  private List<Course> generateCourse (){
      List<Course>  courses = new ArrayList<>();
      //возвращаем значение от 0 до N
      int size= new Random().nextInt(9);
      for (int i=0;i<=size ; i++)
          courses.add(new Course(courseName[i],(size+1)*8));
      return courses;
  }


    private void generateCurriculum() {
        for (String curriculum : curriculumName) {
            courseService.addCourse(generateCourse());
            curriculumService.newCurricula(
                    new CURRICULUM(curriculum, LocalDate.now(), courseService.getCourses()));
        }
    }

    private  List<Marks> generateMarks(int duration){
      List<Marks> marks = new ArrayList<>();
      for (int i=0; i<= new Random().nextInt(duration); i++){
          marks.add(Marks.values() [new Random().nextInt(5)]);
      }
      return marks;
    }

    private  void generateStudent(){
      generateCurriculum();
      for (String student: studentName){
          int currentIndex = new Random().nextInt(4);
          studentsService.addStudents(new Student(student, curriculumService.getCurricula().get(currentIndex),
                  generateMarks(curriculumService.getCurricula().get(currentIndex).getCourses().stream().mapToInt(Course::getCoursetime).sum()/8),
                  "Может продолжить обучение"));
      }


    }

  public StudentsService getStudentsService(){
      generateStudent();
      return studentsService;
  }

}
