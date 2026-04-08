abstract class ATM{
abstract void withdraw(double amount);
abstract void deposit(double amount);
void checkBalance(){
System.out.println("Checking balance...");
}
}

class SBIATM extends ATM{
double balance=10000;
@Override
void withdraw(double amount){
balance=balance-amount;
System.out.println("SBI Withdraw: "+amount);
}
@Override
void deposit(double amount){
balance=balance+amount;
System.out.println("SBI Deposit: "+amount);
}
}

class HDFCATM extends ATM{
double balance=20000;
@Override
void withdraw(double amount){
balance=balance-amount;
System.out.println("HDFC Withdraw: "+amount);
}
@Override
void deposit(double amount){
balance=balance+amount;
System.out.println("HDFC Deposit: "+amount);
}
}

public class ATMdemo{
public static void main(String[] args){
ATM a1=new SBIATM();
ATM a2=new HDFCATM();
System.out.println("---- ATM 1 ----");
a1.checkBalance();
a1.deposit(2000);
a1.withdraw(1000);
System.out.println("\n---- ATM 2 ----");
a2.checkBalance();
a2.deposit(3000);
a2.withdraw(1500);
}
}