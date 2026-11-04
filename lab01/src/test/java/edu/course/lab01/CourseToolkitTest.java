package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    // isPrime

    @Test
    void returnsFalseForNumbersLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void returnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }

    @Test
    void returnsFalseForCompositeNumbers() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(6));
        assertFalse(CourseToolkit.isPrime(10));
    }

    @Test
    void returnsFalseForSquaresOfPrimes() {
        assertFalse(CourseToolkit.isPrime(9));  // 3*3
        assertFalse(CourseToolkit.isPrime(25)); // 5*5
    }


    //isPalindrome

        @Test
    void returnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("шалаш"));
    }

    @Test
    void returnsFalseForNonPalindrome() {
        
        assertFalse(CourseToolkit.isPalindrome("дом"));
        assertFalse(CourseToolkit.isPalindrome("Шалаш")); // разные Ш
    }

    @Test
    void throwsExceptionForNullPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    // average 

        @Test
    void returnsAverageForPositiveNumbers() {
        int[] numbers = {2, 4, 6};
        assertEquals(4.0, CourseToolkit.average(numbers), 0.001);
    }

    @Test
    void returnsAverageForNegativeNumbers() {
        int[] numbers = {-2, -4, -6};
        assertEquals(-4.0, CourseToolkit.average(numbers), 0.001);
    }

    @Test
    void throwsExceptionForEmptyOrNullArray() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[]{}));
    }


    // min and max

    @Test
    void returnsMinAndMaxForArray() {
        int[] numbers = {5, 2, 8, -1, 10};
        //min 
        assertEquals(-1, CourseToolkit.min(numbers));
        //max
        assertEquals(10, CourseToolkit.max(numbers));
    }


}

