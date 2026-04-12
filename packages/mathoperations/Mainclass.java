package mathoperations;
 class Addition {
 public int add(int a,int b){
return a+b;}
}
public class Mainclass {
public static void main(String[] agrs){
Addition a=new Addition();
int t=a.add(5,7);
System.out.println(t);
}
}