package com.sda.pętle;

import java.util.Scanner;

public class ZAdanie_sda {
    public static void main(String[] args) {
        double amount;
        int numberOfInstallments;
        Scanner sc = new Scanner(System.in);

        amount = sc.nextDouble();
        numberOfInstallments = sc.nextInt();


        double loanPercentage;
        if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            loanPercentage  = 0.025;
        } else if ( numberOfInstallments <= 24) {
            loanPercentage = 0.05;
        } else {
            loanPercentage = 0.1;
        }
        if (amount < 100 || amount > 10000) {
            amount = 5000;
        }
        if (numberOfInstallments < 6 || numberOfInstallments > 48) {
            numberOfInstallments = 36;
        }
        System.out.println(amount * (1+ loanPercentage)/numberOfInstallments);

    }

}