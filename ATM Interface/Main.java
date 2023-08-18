package swagat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperations op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("****WELCOME TO ATM MACHINE****");
        System.out.println("Enter Atm number:-");
        int atmNumber = sc.nextInt();
        System.out.println("Enter your Atm pin:-");
        int pin = sc.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            while (true){
                System.out.println("1.view available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter choice:-");
                int ch= sc.nextInt();
                if(ch==1){
                   op.viewBalance();
                } else if (ch==2) {
                    System.out.println("Enter the amount to withdraw:-");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.println("Enter amount to deposit:-");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch==4) {
                    op.viewMiniStatement();
                } else if (ch==5) {
                    System.out.println("Collect your ATM card\nThank you for using this ATM");
                    System.exit(0);
                }
                else {
                    System.out.println("please enter correct choice");
                }

            }
        }
        else {
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }
    }
}
