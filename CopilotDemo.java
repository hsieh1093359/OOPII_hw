/**
 * GitHub Copilot Demo - Simple Banking System
 */

class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " 存入 $" + amount + "，餘額: $" + balance);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(owner + " 提領 $" + amount + "，餘額: $" + balance);
            return true;
        }
        System.out.println("餘額不足！");
        return false;
    }
}

public class CopilotDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("王小明", 5000);
        account.deposit(3000);
        account.withdraw(2000);
        account.withdraw(10000);
    }
}