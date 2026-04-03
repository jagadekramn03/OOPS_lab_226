class Vehicle{
String name;
Vehicle(String name){
this.name=name;
}
void startEngine(){
System.out.println(name+" engine starts in a general way.");
}
void fuelType(){
System.out.println(name+" uses generic fuel.");
}
void speed(){
System.out.println(name+" has average speed.");
}
}

class Car extends Vehicle{
Car(String name){
super(name);
}
@Override 
void startEngine(){
System.out.println(name+" starts with a key ignition system.");
}
@Override 
void fuelType(){
System.out.println(name+" uses petrol or diesel.");
}
@Override 
void speed(){
System.out.println(name+" runs at high speed.");
}
}

class ElectricCar extends Vehicle{
ElectricCar(String name){
super(name);
}
@Override
 void startEngine(){
System.out.println(name+" starts silently with a battery.");
}
@Override 
void fuelType(){
System.out.println(name+" uses electricity.");
}
@Override 
void speed(){
System.out.println(name+" has smooth and fast acceleration.");
}
}

class Bike extends Vehicle{
Bike(String name){
super(name);
}
@Override 
void startEngine(){
System.out.println(name+" starts with a self or kick start.");
}
@Override 
void fuelType(){
System.out.println(name+" uses petrol.");
}
@Override 
void speed(){
System.out.println(name+" runs at moderate speed.");
}
}

public class OverridingDemo{
public static void main(String[] args){
Vehicle v1=new Car("Car");
Vehicle v2=new ElectricCar("Electric Car");
Vehicle v3=new Bike("Bike");
System.out.println("---- Vehicle 1 ----");
v1.startEngine();v1.fuelType();v1.speed();
System.out.println("\n---- Vehicle 2 ----");
v2.startEngine();v2.fuelType();v2.speed();
System.out.println("\n---- Vehicle 3 ----");
v3.startEngine();v3.fuelType();v3.speed();
}
}