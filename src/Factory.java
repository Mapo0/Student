import service.StudentsService;
import service.impl.StudentsServiceImpl;

public class Factory {

    public static StudentsService getSturentService() {
        return new StudentsServiceImpl();
    }
}
