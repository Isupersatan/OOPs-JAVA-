// Encapsulation - Data Protection
// What it means: Keeping data safe inside a "capsule" and controlling access.

class BankAccount {

    //private data hidden from outside
    private double balance;
    private String accountNum;

    //public methods to access private data
    public BankAccount(String accountNum) {
        this.accountNum = accountNum;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public void accdetails() {
        System.out.println("Account Number: " + accountNum.substring(0, 3) + "XXX");//partially showing account number
        System.err.println("Account Balance: " + balance);
    }

}

public class encpsltnExp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");

        account.deposit(1000);
        account.accdetails();//after deposit

        account.withdraw(500);
        account.accdetails();//after withdrawal

    }
}
