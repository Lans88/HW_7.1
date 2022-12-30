package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.hw71.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 25, 58, 4, 35, 93, 88, 6, 1, 11, 207};
        long expected = 207;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}