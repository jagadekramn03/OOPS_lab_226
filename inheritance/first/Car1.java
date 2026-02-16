 class Vehicle {
String brand="Audi";
void brandname() {
System.out.println("Brand : " + brand);
}
}
 class Car extends Vehicle {
String model="A4 sedan";
void modelname() {
System.out.println("Model : " + model);
}
}
public class Car1 {
public static void main(String[] agrs)
{
Car c=new Car();
c.brandname();
c.modelname();

}
}

