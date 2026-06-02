package com.example.utils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Starting StringUtils tests...");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a test case...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finished a test case...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finished all StringUtils tests...");
    }

    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level"})
    void testPalindrome(String input) {
        assertTrue(StringUtils.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world"})
    void testCountVowels(String input) {
        assertTrue(StringUtils.countVowels(input) > 0);
    }
}
