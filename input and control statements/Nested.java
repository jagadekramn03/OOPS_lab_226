import java.util.Scanner;
class Nested{
public static void main(String[] agrs)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Salary and Service time to add bonus to salary");
System.out.println("Enter the salary : ");
double sal=s.nextDouble();
System.out.println("Enter service time : ");
int ser=s.nextInt();
int b;
if(ser>5)
{ 
if (sal>=50000)
{
 b=10;
}
else
{
 b=5;
}
} 
else
{
b=0;
}
double ts=sal+((sal*b)/100.00);
System.out.println("the total salary after adding bonus : " + ts);
}
}