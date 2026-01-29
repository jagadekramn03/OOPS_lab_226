import java.util.*;
class Forloop{
public static void main (String[] agrs)
{
String t;
int noofitems,r;
int total=0;
Scanner item=new Scanner(System.in);
System.out.println("enter how many items u want to order : ");
noofitems=item.nextInt();
item.nextLine();
for(int i=0;i<noofitems;i++)
{
System.out.println("enter item idli/dosa/vada/puri : ");
t=item.nextLine();
if(t.equals("idli"))
{
System.out.println("idli is ordered");
r=30;
}
else if (t.equals("dosa"))
{
System.out.println("dosa is ordered");
r=40;
}
else if(t.equals("vada"))
{
System.out.println("vada is ordered");
r=15;
}
else if(t.equals("puri"))
{
System.out.println("puri is ordered");
r=25;
}
else 
{
System.out.println("nothing is ordered");
r=0;
}

System.out.println(" Your order is " + t);
System.out.println(" cost " + r);
total+=r;
}
System.out.println("Total bill: " + total);
}
}



