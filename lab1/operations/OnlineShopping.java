public class OnlineShopping {
public static void main(String[] agrs)
{
int items=5;
float price=395.2f;
int discount=10;
float totalPrice = items*price;
float discountAmount = (totalPrice * discount) / 100;
float finalPrice = totalPrice - discountAmount;
float averagePrice = totalPrice / items;
items++;
discount++;
boolean moreItems = items > 2;
boolean exactDiscount = discount == 10;
boolean priceCheck = price != 300;
boolean validOrder = (items > 0) && (price > 0);
boolean specialOrder = (items > 5) || (discount> 5);
boolean notEmpty = !(items == 0);
System.out.println("Total Price: " + totalPrice);
System.out.println("Discount Amount: " + discountAmount);
System.out.println("Final Price: " + finalPrice);
System.out.println("Average Price per Item: " + averagePrice);
System.out.println("Items after increment: " + items);
System.out.println("Discount after decrement: " + discount);
System.out.println("Relational Results:");
System.out.println(moreItems);
System.out.println(exactDiscount);
System.out.println(priceCheck);
System.out.println("Logical Results:");
System.out.println(validOrder);
System.out.println(specialOrder);
System.out.println(notEmpty);
}
}


