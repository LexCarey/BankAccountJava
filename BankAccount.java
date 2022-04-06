import java.util.Random;

public class BankAccount {
    
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts;
    private static int totalMoney;

    //CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        totalAccounts++;
    }


    //METHODS
    public void depositCheckingBalance(double amount) {
        totalMoney += amount;
        this.checkingBalance +=amount;
    }

    public void depositSavingBalance(double amount) {
        totalMoney += amount;
        this.savingsBalance +=amount;
    }

    public void withdrawCheckingBalance(double amount) {
        if((this.checkingBalance - amount) > 0){
            totalMoney -= amount;
            this.checkingBalance -= amount;
        }
    }

    public void withdrawSavingBalance(double amount) {
        if((this.savingsBalance - amount) > 0){
            totalMoney -= amount;
            this.savingsBalance -= amount;
        }
    }

    public double getTotalBalance() {
        return this.checkingBalance + this.savingsBalance;
    }


    // GETTERS
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingsBalance;
    }
}
