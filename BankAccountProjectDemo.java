import java.io.*;
import java.util.ArrayList;

// This code is using Hashmap to print Bank account details

import java.util.HashMap;
import java.util.Scanner;

class BankAccountDemo  {
    String Name;
    int AccountNumber;
    int Balance;

    public BankAccountDemo(String name, int accountNumber, int balance) {
        Name = name;
        AccountNumber = accountNumber;
        Balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccountDemo{" +
                "Name='" + Name + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", Balance=" + Balance +
                '}';
    }
}

class BankAccount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,BankAccountDemo> bankAccounts = new HashMap<>();

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for customer " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Balance: ");
            int balance = sc.nextInt();
            sc.nextLine(); // consume newline

            BankAccountDemo account = new BankAccountDemo(name, accNo, balance);
            bankAccounts.put(accNo,account);
        }

        System.out.println("\n--- All Customers ---");
        for (BankAccountDemo account : bankAccounts.values()) {
            System.out.println(account);
        }
    }
}


