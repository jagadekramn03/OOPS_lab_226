import java.util.*;
class Do_while{
public static void main(String[] agrs){
Scanner r=new Scanner(System.in);
int c;
double b=200000;
double a;
do{
System.out.println("\n--- ATM MENU ---");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
c=r.nextInt();
if(c==1)
{
System.out.println("Total balance : " + b);
}
else if (c==2)
{
System.out.println("enter amount:");
a=r.nextDouble();
b=b+a;
System.out.println("Deposited \n Total balance : " + b);
}
else if (c==3)
{
System.out.println("enter amount:");
a=r.nextDouble();
if (a <= b) 
{
b = b-a;
System.out.println("Please collect your cash \n Total balance : " + b);
}
else 
{
System.out.println("Insufficient balance");
}
}
else if (c == 4) 
{
System.out.println("Thank you! Visit again");
} 
else 
{
System.out.println("Invalid choice");
}
}
while(c!=4);
}
}
