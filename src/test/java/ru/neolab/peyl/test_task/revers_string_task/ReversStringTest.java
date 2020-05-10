package ru.neolab.peyl.test_task.revers_string_task;

import org.junit.Before;
import org.junit.Test;
import ru.neolab.peyl.test_tasks.revers_string_task.ReversString;
import ru.neolab.peyl.test_tasks.revers_string_task.ReversStringException;

import static org.junit.Assert.assertEquals;

public class ReversStringTest {

    private ReversString reversString;

    @Before
    public void init() {
        reversString = new ReversString();
    }

    @Test(expected = ReversStringException.class)
    public void testNullString() throws ReversStringException {
        String inputStr = null;
        reversString.revertString(inputStr);
    }

    @Test
    public void testAllAlphabetCharacters() throws ReversStringException {
        String expectedReversString = "dmckrjdkas";
        String inputStr = "sakdjrkcmd";
        String actualString = reversString.revertString(inputStr);
        assertEquals(expectedReversString, actualString);
    }

    @Test
    public void testStringWithRussianAlphabetCharacters() throws ReversStringException {
        String expectedReversString = "яркярк";
        String inputStr = "кря-кря";
        String actualString = reversString.revertString(inputStr);
        assertEquals(expectedReversString, actualString);
    }

    @Test
    public void testStringCapsAlphabetCharacters() throws ReversStringException {
        String expectedReversString = "epolkpIgS";
        String inputStr = "SgIpkl9*ope";
        String actualString = reversString.revertString(inputStr);
        assertEquals(expectedReversString, actualString);
    }

    @Test
    public void testEmptyString() throws ReversStringException {
        String expectedReversString = "";
        String inputStr = "";
        String actualString = reversString.revertString(inputStr);
        assertEquals(expectedReversString, actualString);
    }

    @Test
    public void testReversString() throws ReversStringException {
        String expectedReversString = "ЯwqlNлYfkE";
        String inputStr = "Ek5fY*л$N@lqw63Я9";
        String actualString = reversString.revertString(inputStr);
        assertEquals(expectedReversString, actualString);
    }
}
