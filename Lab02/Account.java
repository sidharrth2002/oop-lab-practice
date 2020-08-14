import java.util.Scanner;
import java.util.Date;  

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    public Account() {
        dateCreated = new Date();
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public static void setInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static double getInterestRate() {
        return this.annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }
    public double getMonthlyInterest() {
        return (annualInterestRate/12/100) * balance; 
    }
    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account.setInterestRate(4.5);
        Account user = new Account(1234, 10000);
        System.out.println("Account id = " + user.getid());
        System.out.println("Created = " + user.getDateCreated());
        System.out.println("Annual interest rate % = " + Account.getInterestRate());
        System.out.println("Balance = " + user.getBalance());
        System.out.println("Monthly interest = " + "RM" + user.getMonthlyInterest());
        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = input.nextDouble();
        user.withdraw(amountToWithdraw);
        System.out.println("Balance = " + user.getBalance());
        System.out.print("Enter amount to deposit: ");
        double amountToDeposit = input.nextDouble();
        user.deposit(amountToDeposit);
        System.out.println("Balance = " + user.getBalance());
    }
}