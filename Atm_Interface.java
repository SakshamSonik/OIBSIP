import java.util.Scanner;
public class Atm_Interface {
    public static void main(String args[]) {
        int Acct_balance = 15000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int pin = 3683;
        System.out.println("Please enter your pin number: ");
        int password = sc.nextInt();
        int i = 1;
        if (password != pin) {
            while (true) {
                i++;
                System.out.println("Wrong pin Number. ");
                System.out.println("Re-enter your pin (Max. Attempts : 5) : ");
                password = sc.nextInt();
                if (password == pin) {
                    break;
                }
                if (i == 3) {
                    System.out.println("You have exceeded your limits. Retry After some time !");
                    System.exit(0);
                }
            }
        }
        if (password == pin) {
            System.out.println("Welcome to ATM services");
            while (true) {
                System.out.println("Enter 1 to Check your Account balance");
                System.out.println("Enter 2 to Withdraw money");
                System.out.println("Enter 3 to Deposit money");
                System.out.println("Enter 4 to QUIT");
                System.out.print("Choose your option: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your Balance is : " + Acct_balance);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter amount you want to Withdraw : ");
                        withdraw = sc.nextInt();
                        if (withdraw > Acct_balance || Acct_balance == 0) {
                            System.out.printf("You have insufficient balance!!\n");
                            break;
                        }
                        System.out.println("Hope you collected your amount!");
                        Acct_balance = Acct_balance - withdraw;
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Enter money to be deposited: ");
                        deposit = sc.nextInt();
                        Acct_balance = Acct_balance + deposit;
                        System.out.println("Your Money has been deposited successfully");
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM!");
                        System.exit(0);
                }
            }
        }
    }
}