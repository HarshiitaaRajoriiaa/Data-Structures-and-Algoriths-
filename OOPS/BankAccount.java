package OOPS;
//https://www.codechef.com/learn/course/college-oops-java/CPOPJA01/problems/OPJA06
class BankAccount {
    public static void main(String[] args) {
        // Write your code here
        BankAccount account = new BankAccount(12345,"John Doe");
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(200);
        account.getAccountInfo();
    }
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Constructor to initialize the attributes
    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is 0
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    // Display account information
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance); 
    }
}


    


