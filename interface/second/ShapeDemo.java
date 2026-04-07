interface Shape{
double area();
void display();
}

class Circle implements Shape{
double radius;
Circle(double radius){
this.radius=radius;
}
@Override
public double area(){
return 3.14*radius*radius;
}
@Override
public void display(){
System.out.println("Circle Area: "+area());
}
}

class Rectangle implements Shape{
double length,width;
Rectangle(double length,double width){
this.length=length;
this.width=width;
}
@Override
public double area(){
return length*width;
}
@Override
public void display(){
System.out.println("Rectangle Area: "+area());
}
}

class Triangle implements Shape{
double base,height;
Triangle(double base,double height){
this.base=base;
this.height=height;
}
@Override
public double area(){
return 0.5*base*height;
}
@Override
public void display(){
System.out.println("Triangle Area: "+area());
}
}

public class ShapeDemo{
public static void main(String[] args){
Shape s1=new Circle(5);
Shape s2=new Rectangle(4,6);
Shape s3=new Triangle(3,7);
System.out.println("---- Shape 1 ----");
s1.display();
System.out.println("\n---- Shape 2 ----");
s2.display();
System.out.println("\n---- Shape 3 ----");
s3.display();
}
}