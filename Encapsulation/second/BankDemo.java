class BankAccount{
private String accountHolder;
private double balance;

public void setAccountHolder(String name){
accountHolder=name;
}

public String getAccountHolder(){
return accountHolder;
}

public void deposit(double amount){
if(amount>0){
balance=balance+amount;
}
}

public void withdraw(double amount){
if(amount<=balance){
balance=balance-amount;
}
}

public double getBalance(){
return balance;
}
}

public class BankDemo{
public static void main(String[] args){
BankAccount b=new BankAccount();
b.setAccountHolder("Ravi");
b.deposit(5000);
b.withdraw(1500);
System.out.println("Account Holder: "+b.getAccountHolder());
System.out.println("Balance: "+b.getBalance());
}
}