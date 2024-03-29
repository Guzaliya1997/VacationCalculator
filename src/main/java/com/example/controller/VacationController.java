package com.example.controller;

import com.example.util.NonWorkingHolidays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@RestController
public class VacationController {

    NonWorkingHolidays nonWorkingHolidays;
    public final String weekEndOne = "SATURDAY";
    public final String weekEndTwo = "SUNDAY";


    @GetMapping("/calculate")
    public double calculateVacationPay
            (@RequestParam double averageSalary, @RequestParam("startDate") LocalDate startDate,
             @RequestParam("endDate") LocalDate endDate) {
        nonWorkingHolidays = new NonWorkingHolidays();

        List<LocalDate> listOfHolidays = nonWorkingHolidays.getListOfHolidays();
        int vacationDays = 0;
        boolean notHoliday = true;

        while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
            DayOfWeek dayOfWeek = startDate.getDayOfWeek();
            if (dayOfWeek.toString().equals(weekEndOne) || dayOfWeek.toString().equals(weekEndTwo)) {
                startDate = startDate.plusDays(1);
            } else {
                for (LocalDate holidayDate : listOfHolidays) {
                    if (holidayDate.isEqual(startDate)) {
                        break;
                    }
                }
                if (notHoliday) {
                    vacationDays++;
                }
                startDate = startDate.plusDays(1);
            }
        }
            double vacationPay = Math.round(averageSalary / 29.3 * vacationDays);

            return vacationPay;

    }
}

