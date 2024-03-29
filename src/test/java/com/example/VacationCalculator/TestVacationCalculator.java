package com.example.VacationCalculator;

import com.example.controller.VacationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestVacationCalculator {
    @InjectMocks
    private VacationController vacationController;

    @Test
    public void testCalculateVacationPay() {
        double response = vacationController.calculateVacationPay(60000, LocalDate.of(2024, 4, 1), LocalDate.of(2024, 4, 12));

        assertEquals(20478.0, response, 0.0001);
    }

}
