class Student1
{
    String name;
    int age;
    String course;

    
    Student1()
    {
        this("Unknown", 0, "Not Assigned");
    }

    
    Student1(String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String args[])
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Rahul", 20, "Computer Science");

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("Student 2 Details:");
        s2.display();
    }
}