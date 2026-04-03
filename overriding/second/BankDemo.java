class Bank{
String name;
Bank(String name){
this.name=name;
}
double getInterestRate(){
return 5.0;
}
void display(){
System.out.println(name+" provides general banking services.");
}
}

class SBI extends Bank{
SBI(){
super("SBI");
}
@Override
double getInterestRate(){
return 6.5;
}
@Override
void display(){
System.out.println(name+" provides loans with moderate interest.");
}
}

class HDFC extends Bank{
HDFC(){
super("HDFC");
}
@Override
double getInterestRate(){
return 7.2;
}
@Override
void display(){
System.out.println(name+" provides fast banking services.");
}
}

class ICICI extends Bank{
ICICI(){
super("ICICI");
}
@Override
double getInterestRate(){
return 6.8;
}
@Override
void display(){
System.out.println(name+" provides digital banking facilities.");
}
}

public class BankDemo{
public static void main(String[] args){
Bank b1=new SBI();
Bank b2=new HDFC();
Bank b3=new ICICI();
System.out.println("---- Bank 1 ----");
b1.display();
System.out.println("Interest Rate: "+b1.getInterestRate()+"%");
System.out.println("\n---- Bank 2 ----");
b2.display();
System.out.println("Interest Rate: "+b2.getInterestRate()+"%");
System.out.println("\n---- Bank 3 ----");
b3.display();
System.out.println("Interest Rate: "+b3.getInterestRate()+"%");
}
}