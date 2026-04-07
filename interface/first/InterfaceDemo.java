interface Payment{
void pay();
void refund();
}

class CreditCard implements Payment{
@Override
public void pay(){
System.out.println("Payment done using Credit Card");
}
@Override
public void refund(){
System.out.println("Refund to Credit Card");
}
}

class UPI implements Payment{
@Override
public void pay(){
System.out.println("Payment done using UPI");
}
@Override
public void refund(){
System.out.println("Refund to UPI account");
}
}

class Cash implements Payment{
@Override
public void pay(){
System.out.println("Payment done using Cash");
}
@Override
public void refund(){
System.out.println("Refund given in Cash");
}
}

public class InterfaceDemo{
public static void main(String[] args){
Payment p1=new CreditCard();
Payment p2=new UPI();
Payment p3=new Cash();
System.out.println("---- Payment 1 ----");
p1.pay();
p1.refund();
System.out.println("\n---- Payment 2 ----");
p2.pay();
p2.refund();
System.out.println("\n---- Payment 3 ----");
p3.pay();
p3.refund();
}
}