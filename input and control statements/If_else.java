import java.util.Scanner;
class If_else
{
public static void main(String[] agrs)
{
Scanner cu=new Scanner(System.in);
System.out.println("Enter units to calculate total bill ");
double un=cu.nextDouble();
int u;
if (un<=100)
{
u=2;
}
else if (un<=200)
{
u=3;
}
else if (un<=300)
{
u=4;
}
else
{
u=7;
}
System.out.println("Total bill (in rupees) : " + un*u + " it charges " + u + "/unit");
}
}