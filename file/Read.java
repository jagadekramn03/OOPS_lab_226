import java.io.*;
import java.util.*;
public class Read {
public static void main(String[] args){
try {
File file=new File("numbers.txt");
Scanner sc=new Scanner(file);
int sum=0;
int count=0;
while(sc.hasNext()){
int num=sc.nextInt();
sum+=num;
count++;
} sc.close();
double avg;
if (count!=0){
avg=(double)sum/count;
}
else {
avg=0;
}
System.out.println(sum);
System.out.println(avg);
}
catch(FileNotFoundException e) {
System.out.println("File not found");
}
catch (Exception e) {
System.out.println("Invalid File");
}
}}