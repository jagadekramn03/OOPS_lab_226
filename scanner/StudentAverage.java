import java.util.Scanner;

class StudentAverage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter marks of 3 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}