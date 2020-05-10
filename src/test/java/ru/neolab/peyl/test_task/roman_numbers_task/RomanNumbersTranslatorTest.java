package ru.neolab.peyl.test_task.roman_numbers_task;

import org.junit.Before;
import org.junit.Test;
import ru.neolab.peyl.test_tasks.roman_numers_task.RomanNumberTranslatorException;
import ru.neolab.peyl.test_tasks.roman_numers_task.RomanNumbersTranslator;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTranslatorTest {
    private RomanNumbersTranslator romanNumbersTranslator;

    @Before
    public void init() {
        romanNumbersTranslator = new RomanNumbersTranslator();
    }

    @Test(expected = RomanNumberTranslatorException.class)
    public void testNegativeNumbers() throws RomanNumberTranslatorException {
        int inputNum = -3;
        romanNumbersTranslator.getRomeNum(inputNum);

    }

    @Test(expected = RomanNumberTranslatorException.class)
    public void testZero() throws RomanNumberTranslatorException {
        int inputNum = 0;
        romanNumbersTranslator.getRomeNum(inputNum);

    }

    @Test
    public void testMinAllowableNumber() throws RomanNumberTranslatorException {
        int inputNum = 1;
        String expectedRomanNumber = "I";
        String actualRomanNumber = romanNumbersTranslator.getRomeNum(inputNum);
        assertEquals(expectedRomanNumber, actualRomanNumber);
    }

    @Test
    public void testMaxAllowableNumber() throws RomanNumberTranslatorException {
        int inputNum = 3999;
        String expectedRomanNumber = "MMMCMXCIX";
        String actualRomanNumber = romanNumbersTranslator.getRomeNum(inputNum);
        assertEquals(expectedRomanNumber, actualRomanNumber);
    }

    @Test
    public void testAllowableNumber() throws RomanNumberTranslatorException {
        int inputNum = 2637;
        String expectedRomanNumber = "MMDCXXXVII";
        String actualRomanNumber = romanNumbersTranslator.getRomeNum(inputNum);
        assertEquals(expectedRomanNumber, actualRomanNumber);
    }

    @Test(expected = RomanNumberTranslatorException.class)
    public void testMinInvalidPositiveNumber() throws RomanNumberTranslatorException {
        int inputNum = 4000;
        romanNumbersTranslator.getRomeNum(inputNum);

    }

    @Test(expected = RomanNumberTranslatorException.class)
    public void testInvalidPositiveNumber() throws RomanNumberTranslatorException {
        int inputNum = 5689;
        romanNumbersTranslator.getRomeNum(inputNum);

    }
}
