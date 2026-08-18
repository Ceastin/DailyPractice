package BNK;

public class Main {
    public static void main(String[] args)
    {
        BankAccount acc=new BankAccount("Sahil",1000);

        acc.deposit(3400);
        acc.withdraw(500);
        acc.deposit(-20);
        acc.deposit(20);
        acc.withdraw(-400);
        acc.withdraw(400);
        System.out.println(acc.getOwner());
        System.out.println(acc.getBalance());
    }
}
