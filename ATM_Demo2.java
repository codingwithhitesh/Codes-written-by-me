import java.util.Scanner;

public class ATM_Demo2 {

    //static int Bal = 0;

    static class ATM {
        int debit = 0;
        int credit =0;
        int Balance;

        String customerName;

        void checkBalance(String customerName) {
            System.out.println("Hello !! " + customerName + "  You can check your Balance");
        }

        void moneyCredit (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Credit amount\n");
            credit = sc.nextInt();
            Balance = Balance + credit;
            System.out.println("New bal is  "+ Balance);

        }

        void moneyDebit() {
            //System.out.println("Hello !!! " + customerName + "Your balance is " + Bal +"  This amt can withdraw \n");
            System.out.println("Enter debit amount\n");
            Scanner sc1 = new Scanner(System.in);
            debit = sc1.nextInt();
            Balance = Balance - debit;
            System.out.println("New bal is  "+ Balance);
        }
    }

    static class Customer{

        ATM  atm1 = new ATM();

        void AtmOperation (String Name , int Balance) {
            atm1.Balance = Balance;
            atm1.checkBalance("Hello " + Name + " ; Your Current bal is  "+ Balance);
            atm1.moneyDebit();
            atm1.moneyCredit();
        }
    }

    public static void main(String[] args) {
        Customer C1 = new Customer();
        C1.AtmOperation("Hitesh",1000);
    }
}

