import java.util.*;
class Input1{
public static void main(String[] agrs){
Scanner num=new Scanner(System.in);
System.out.println("Enter three numbers to get their addition, multiplication,average");
System.out.println("Enter the three numbers:");
int a=num.nextInt();
int b=num.nextInt();
int c=num.nextInt();
int add=a+b+c;
double mul=a*b*c;
double avg=add/3.0;
System.out.println("Addition=" + add + "\n" +"Multiplication =" + mul + "\n" + "Average =" + avg);
}
}