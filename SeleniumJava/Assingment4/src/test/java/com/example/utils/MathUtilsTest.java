package com.example.utils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @BeforeAll
    static void initAll() { System.out.println("Starting MathUtils tests..."); }

    @BeforeEach
    void init() { System.out.println("Starting a test case..."); }

    @AfterEach
    void tearDown() { System.out.println("Finished a test case..."); }

    @AfterAll
    static void tearDownAll() { System.out.println("Finished all MathUtils tests..."); }

    @Test
    void testFactorial() { assertEquals(120, MathUtils.factorial(5)); }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11})
    void testPrime(int n) { assertTrue(MathUtils.isPrime(n)); }

    @Test
    void testGcd() { assertEquals(6, MathUtils.gcd(54, 24)); }
}
