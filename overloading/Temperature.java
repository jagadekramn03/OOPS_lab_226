class Temperature {
static double f;
static double c;
static double k;
public static void  convert(double c) {
f = c * 9 / 5.0 + 32;
System.out.println(" the T in celsius ( " + c + ") to fahrenheit - " + f);
}
public static void  convert(int f) {
c = (f - 32) * 5 / 9.0;
System.out.println(" the T in fahrenheit ( " + f + ") to celsius - " + c);
}
public static void  convert(double c , String s) {
k=273.15+c;
System.out.println(" the T in celsius ( " + c + ") to Kalvein - " + k);
}
public static void main(String[] agrs) {
Temperature.convert(23.4);        
Temperature.convert(77);       
Temperature.convert(23.4, "K");  
}
}







