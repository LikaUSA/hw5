package ru.netology.javaga.hw5.services;

public class FreeLanceCalculate {
    public int calculateDays (int income, int expenses, int thresholds) {
        int money = 0;
        int freeMonths = 0;
        for ( int i = 0; i < 12; i++) {
            if (money >= thresholds) { // можем ли отдыхать?
                money = (money - expenses) / 3;
                freeMonths ++;
            } else {
                money -= expenses;
                money += income;
            }
        }
        return freeMonths;
    }
}

