package com.example.utils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    @BeforeAll
    static void initAll() { System.out.println("Starting DateUtils tests..."); }

    @BeforeEach
    void init() { System.out.println("Starting a test case..."); }

    @AfterEach
    void tearDown() { System.out.println("Finished a test case..."); }

    @AfterAll
    static void tearDownAll() { System.out.println("Finished all DateUtils tests..."); }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2004, 2020})
    void testLeapYear(int year) { assertTrue(DateUtils.isLeapYear(year)); }

    @Test
    void testIsWeekend() {
        assertTrue(DateUtils.isWeekend(LocalDate.of(2025, 9, 27))); // Saturday
    }

    @Test
    void testGetYearFromDate() {
        assertEquals(2025, DateUtils.getYearFromDate(LocalDate.of(2025, 9, 26)));
    }
}
