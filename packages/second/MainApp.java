import student.Student;
import result.Result;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student(101, "Ram", 85, 70, 90);
        Result r = new Result();
        r.calculate(s);
    }
}