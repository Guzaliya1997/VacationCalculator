package com.example.util;
import com.example.controller.VacationController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class NonWorkingHolidays {
    public ArrayList<LocalDate> getListOfHolidays() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        LocalDate newYear1 = LocalDate.of(year, 1, 1);
        LocalDate newYear2 = LocalDate.of(year, 1, 2);
        LocalDate newYear3 = LocalDate.of(year, 1, 3);
        LocalDate newYear4 = LocalDate.of(year, 1, 4);
        LocalDate newYear5 = LocalDate.of(year, 1, 5);
        LocalDate newYear6 = LocalDate.of(year, 1, 6);
        LocalDate christmas = LocalDate.of(year, 1, 7);
        LocalDate newYear8 = LocalDate.of(year, 1, 8);
        LocalDate defenders_of_the_fatherland = LocalDate.of(year, 2, 23);
        LocalDate woman_day = LocalDate.of(year, 3, 8);
        LocalDate spring_and_labor_day = LocalDate.of(year, 5, 1);
        LocalDate victory_day = LocalDate.of(year, 5, 9);
        LocalDate russia_day = LocalDate.of(year, 6, 12);
        LocalDate national_unity_day = LocalDate.of(year, 11, 4);


        ArrayList<LocalDate> listOfHolidays = new ArrayList<>();


        listOfHolidays.add(newYear1);
        listOfHolidays.add(newYear2);
        listOfHolidays.add(newYear3);
        listOfHolidays.add(newYear4);
        listOfHolidays.add(newYear5);
        listOfHolidays.add(newYear6);
        listOfHolidays.add(christmas);
        listOfHolidays.add(newYear8);
        listOfHolidays.add(defenders_of_the_fatherland);
        listOfHolidays.add(woman_day);
        listOfHolidays.add(spring_and_labor_day);
        listOfHolidays.add(victory_day);
        listOfHolidays.add(russia_day);
        listOfHolidays.add(national_unity_day);
        return listOfHolidays;

    }
}
