package result;

import student.Student;

public class Result {

    public void calculate(Student s) {
        int total = s.getM1() + s.getM2() + s.getM3();
        double avg = total / 3.0;
        String grade;

        if (avg >= 75)
            grade = "A";
        else if (avg >= 60)
            grade = "B";
        else if (avg >= 50)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}