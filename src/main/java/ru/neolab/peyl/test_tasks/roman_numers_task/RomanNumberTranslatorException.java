package ru.neolab.peyl.test_tasks.roman_numers_task;

/**
 * Class for exceptions when working with translation from decimal to Roman
 */
public class RomanNumberTranslatorException extends Exception {

    /**
     * Basic constructor for creating exception
     *
     * @param message - message exception
     */

    public RomanNumberTranslatorException(final String message) {
        super(message);
    }
}
