package ru.neolab.peyl.test_tasks.revers_string_task;

/**
 * Class for exceptions when working with string reverse
 */
public class ReversStringException extends Exception {

    /**
     * Basic constructor for creating exception
     *
     * @param message - message exception
     */

    public ReversStringException(final String message) {
        super(message);
    }
}
