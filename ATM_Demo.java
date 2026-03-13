import java.util.Scanner;

public class ATM_Demo {
    static class ATM {
        int debit = 0;
        int credit =0;
        int Bal = 0;
        String customerName;

        void checkBalance(String customerName) {
            System.out.println("Hello !! " + customerName + "  You can check your Balance");
        }

        void moneyCredit (String customerName){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Credit amount\n");
            credit = sc.nextInt();
            Bal = Bal + credit;
            System.out.println("New bal is  "+ Bal);

        }

        void moneyDebit(String customerName) {
            //System.out.println("Hello !!! " + customerName + "Your balance is " + Bal +"  This amt can withdraw \n");
            System.out.println("Enter debit amount\n");
            Scanner sc1 = new Scanner(System.in);
            debit = sc1.nextInt();
            Bal = Bal - debit;
            System.out.println("New bal is  "+ Bal);
        }
    }

    static class Customer{

        ATM  atm1 = new ATM();

            void AtmOperation () {
                atm1.checkBalance("Hitesh");
                atm1.moneyDebit("Hitesh");
                atm1.moneyCredit("Hitesh");
            }
            }


        public static void main(String[] args) {
            Customer C1 = new Customer();

            C1.AtmOperation();
        }

}

