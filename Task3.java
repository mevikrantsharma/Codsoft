
//ATM Interface 
import java.util.Scanner;

class atm {

    int amount;
    int withdraw;
    int money;

    public void deposite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposite amount : ");
        money = sc.nextInt();
        amount=amount+money;
        System.out.println("Amount Deposited");
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);

        {
            System.out.print("Enter the withdraw amount : ");
            withdraw = sc.nextInt();
            if (withdraw > amount) {
                System.out.println("Low Balance ");
            }
            else{
            amount = amount - withdraw;
            System.out.println("Withdraw Succesful");}
        }
    }

    public void checkbalance() {
        System.out.println("Current balance = " + amount);
    }

}

public class Task3 {
    public static void main(String[] args) {

        atm obj = new atm();

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            switch (1) {

            }
            System.out.println("Press 1 to Withdraw money ");
            System.out.println("Press 2 to Deposite money  ");
            System.out.println("Press 3 to Check Balance   ");
            // System.out.println("Pres 4 to exit ");
            System.out.print("Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.withdraw();
                    break;

                case 2:
                    obj.deposite();
                    break;

                case 3:
                    obj.checkbalance();
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}