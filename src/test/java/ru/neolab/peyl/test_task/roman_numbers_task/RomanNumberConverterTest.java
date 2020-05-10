package ru.neolab.peyl.test_task.roman_numbers_task;

import org.junit.Before;
import org.junit.Test;
import ru.neolab.peyl.test_tasks.roman_numers_task.ArraysRomanNumber;

import static org.junit.Assert.assertEquals;

public class RomanNumberConverterTest {
    private ArraysRomanNumber romanNumberConverter;

    @Before
    public void init(){
        romanNumberConverter = new ArraysRomanNumber();
    }

    @Test
    public void testGetArabicNumber(){
        int indexArabicNumber = 5;
        int expectedArabicNumber = 90;
        int actualArabicNumber = romanNumberConverter.getArabicNumber(indexArabicNumber);
        assertEquals(expectedArabicNumber, actualArabicNumber);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGoingBeyondTheArrayOfArabicNumbers(){
        int indexArabicNumber = 20;
        romanNumberConverter.getArabicNumber(indexArabicNumber);
    }

    @Test
    public void testGetRomanNumber(){
        int indexRomanNumber = 5;
        String expectedRomanNumber = "XC";
        String actualRomanNumber = romanNumberConverter.getRomanNumber(indexRomanNumber);
        assertEquals(expectedRomanNumber, actualRomanNumber);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGoingBeyondTheArrayOfRomanNumbers(){
        int indexArabicNumber = 20;
        romanNumberConverter.getRomanNumber(indexArabicNumber);
    }

    @Test
    public void testLengthArrayArabicNumbers(){
        int expectedLengthArrayArabicNumber = 13;
        int actualLengthArrayArabicNumber = romanNumberConverter.getCountArabicNumbers();
        assertEquals(expectedLengthArrayArabicNumber,actualLengthArrayArabicNumber);
    }
}
