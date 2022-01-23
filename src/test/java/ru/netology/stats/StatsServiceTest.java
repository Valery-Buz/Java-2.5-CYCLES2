package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAverage() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSum(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(month);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(month);

        assertEquals(expected, actual);
    }

    @Test
    void numMonthLowAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numMonthLowAvg(month);

        assertEquals(expected, actual);
    }

    @Test
    void numMonthUpAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numMonthUpAvg(month);

        assertEquals(expected, actual);
    }


}