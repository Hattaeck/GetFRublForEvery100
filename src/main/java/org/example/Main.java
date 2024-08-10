package org.example;

public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int totalSumm;
        int refillAmount = 1000;
        int bonus = 0;
        if (refillAmount > 1000) {

        } else {
            bonus = refillAmount / 100;
        }
        int finalBalance = currentBalance + refillAmount + bonus;
        System.out.println("finalBalance: " + finalBalance + "rubles");
        System.out.println("bonusRubles" + bonus);


    }
}