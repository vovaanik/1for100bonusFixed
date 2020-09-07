package com.company;

public class Main {

    public static void main(String[] args) {
        int deposit = 100;
        int amount = 1199; // Zdesy podstavlyaem lyuboe tseloe chislo
        int sum = (amount + deposit);
        int bonus = ((amount) * 1 / 100);
        if (sum > 1100) {
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}
