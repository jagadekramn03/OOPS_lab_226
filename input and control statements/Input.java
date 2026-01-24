import java.util.Scanner;
class Input{
public static void main(String[] args)
{ 
Scanner in= new Scanner(System.in);
System.out.println("Enter the name of company:");
String n=in.nextLine();
System.out.println("Enter how many years u have used the product of that company:");
int e=in.nextInt();
System.out.println("Are u satisfied or not(Y(yes) or N(no)");
char c=in.next().charAt(0);
System.out.println("The customer used the product of " + n +"for"+e);
System.out.println("that customer satisfied or not(Y or N)"+c);
}
} 
