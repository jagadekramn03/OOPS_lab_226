class Person {
String name = "Rahul";
void showName() {
System.out.println("Name: " + name);
}
}

class Student extends Person {
int rollNo = 25;
void showRoll() {
System.out.println("Roll No: " + rollNo);
}
}

public class StudentTest {
public static void main(String[] args) {
Student s = new Student();
s.showName();   
s.showRoll();   }
}