import java.util.Scanner;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;

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
    public double getInterestRate() {
        return this.annualInterestRate;
    }
    public String getDateCreated() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(dateCreated);
        return strDate;
    }
    public double getMonthyInterestRate() {
        return annualInterestRate/12;
    }
    public double getMonthyInterest() {
        return (annualInterestRate/12) * balance; 
    }
    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}

class TestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account.setInterestRate(4.5);
        Account object = new Account(1234, 10000);
        System.out.println("Account id = " + object.getid());
        System.out.println("Created = " + object.getDateCreated());
        System.out.println("Annual interest rate % = " + object.getInterestRate());
        System.out.println("Balance = " + object.getBalance());
        System.out.println("Monthly interest = " + "RM" + object.getMonthyInterest());
        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = input.nextDouble();
        object.withdraw(amountToWithdraw);
        System.out.println("Balance = " + object.getBalance());
        System.out.println("Enter amount to deposit");
        double amountToDeposit = input.nextDouble();
        object.deposit(amountToDeposit);
        System.out.println("Balance = " + object.getBalance());
    }
}