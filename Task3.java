import java.util.Scanner;

class BankAccount{
    private int balance;

    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }

    public int balance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit of " + amount + " bucks was a vibe! ");
        } else {
            System.out.println("Nah, that's invalid. Pick a number above 0. ");
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            System.out.println("Withdrawal of " + amount + " bucks was lit! ");
            balance -= amount;
        } else {
            System.out.println("Bruh, not cool. Either you're broke or you entered a negative value. ");
        }
    }
}

class ATM{

    private BankAccount account; 
    public ATM(BankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("Select Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Leave");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            display();
            System.out.println("Choose your move:");
            option = sc.nextInt();
            
            switch (option){
                case 1:
                    System.out.println("Drop some bucks:");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Withdraw some cash:");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.balance());
                    break;
                case 4:
                    System.out.println("Catch you later! ");
                    break;
                default:
                    System.out.println("Nah, not an option. Choose from the given moves. ");   
            }
        }while (option != 4);
        sc.close();
    }
}

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(30000);
        ATM atm = new ATM(userAccount);
        System.out.println("Enter Your PIN");
        String pin = sc.nextLine();
        if (pin.equals("1234")) {
            atm.run();
        } else {
            System.out.println("Wrong pin, fam. Try again.");
        }
        sc.close();
    }
}

//let's hit up the output