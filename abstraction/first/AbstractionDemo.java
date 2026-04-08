abstract class Employee{
String name;
Employee(String name){
this.name=name;
}
abstract double calculateSalary();
void display(){
System.out.println("Employee Name: "+name);
}
}

class FullTimeEmployee extends Employee{
double salary;
FullTimeEmployee(String name,double salary){
super(name);
this.salary=salary;
}
@Override
double calculateSalary(){
return salary;
}
}

class PartTimeEmployee extends Employee{
int hours;
double rate;
PartTimeEmployee(String name,int hours,double rate){
super(name);
this.hours=hours;
this.rate=rate;
}
@Override
double calculateSalary(){
return hours*rate;
}
}

public class AbstractionDemo{
public static void main(String[] args){
Employee e1=new FullTimeEmployee("Ram",500000);
Employee e2=new PartTimeEmployee("sree",5,5000);
System.out.println("---- Employee 1 ----");
e1.display();
System.out.println("Salary: "+e1.calculateSalary());
System.out.println("\n---- Employee 2 ----");
e2.display();
System.out.println("Salary: "+e2.calculateSalary());
}
}