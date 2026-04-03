class Area {
public static String ar(int l) {
 return "Area of square: " +(l*l);
}
public static String ar(double l, double b) {
return "Area of rectangle: " +(l*b);
}
public static String ar( double r){
return "Area of circle: " + (3.14*r*r);
}
public static void main(String[] agrs) {
Area a=new Area();
System.out.println(Area.ar(2.5));         
System.out.println(Area.ar(2.2, 3.0));  
System.out.println(Area.ar(3));
}
}
