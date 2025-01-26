package ru.netology.javaga.hw5.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FreeLanceCalculateTest {
    @Test
    void shouldCalculateRestMonth1() {
        FreeLanceCalculate services = new FreeLanceCalculate();
        int income = 10000;
        int expenses = 3000;
        int thresholds = 20000;
        int expected = 3;

        int actual = services.calculateDays(income, expenses, thresholds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRestMonth2() {
        FreeLanceCalculate services = new FreeLanceCalculate();
        int income = 100000;
        int expenses = 60000;
        int thresholds = 150000;
        int expected = 2;

        int actual = services.calculateDays(income, expenses, thresholds);

        Assertions.assertEquals(expected, actual);
    }
}