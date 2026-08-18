package BNK;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner,double balance){
        this.owner=owner;
        this.balance=Math.max(balance,0);
    }
    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount)
    {
        if(amount>balance)
            System.out.println("Account Balance Insufficient");
        else if (amount<0) {
            System.out.println("Withdrawal Unsuccessful");
        } else {
            balance=balance-amount;
            System.out.println("Successfull Withdrawal:\n Amount withdrawn:"+amount+"\nCurrent Balance:"+balance);
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successfull:\n Amount Deposited:" + amount + "\nCurrent Balance:" + balance);
        }
        else {
            System.out.println("Deposit Unsuccessfull");
        }
    }
}
