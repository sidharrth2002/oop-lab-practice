public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    public Account() {
        dateCreated = Date.
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
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
    public static void setInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
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
        Account.setInterestRate(4.5);
        Account object = new Account(1234, 10000);

    }
}