public class MobileDataUsage {
public static void main(String[] args) {
float daily = 1.5f;
int days = 28;
float monthlyLimit = 50.0f;
float totalUsed = daily * days;
float remainingData = monthlyLimit - totalUsed;
float averagePerDay = totalUsed / days;
float extraPerWeek = totalUsed % 7;
System.out.println("Total Data Used: " + totalUsed + " GB");
System.out.println("Remaining Data: " + remainingData + " GB");
System.out.println("Average Usage Per Day: " + averagePerDay + " GB");
System.out.println("Extra Data per Week: " + extraPerWeek + " GB");
}
}