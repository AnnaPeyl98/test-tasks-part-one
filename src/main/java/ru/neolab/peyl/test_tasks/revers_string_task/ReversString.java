package ru.neolab.peyl.test_tasks.revers_string_task;

/**
 * Class for reversing a string with the removal of non-alphabet characters
 */
public class ReversString {

    /**
     * Method reverse string. If string contains non-alphabetical characters, then in the output line they are delete.
     *
     * @param inputStr - input string for reverse
     * @return inverted inputStr containing only alphabetic characters
     * @throws ReversStringException - if inputStr is null
     */

    public String revertString(final String inputStr) throws ReversStringException {

        if (inputStr == null) {
            throw new ReversStringException("String is null");
        }

        StringBuilder outputStr = new StringBuilder();
        int sizeString = inputStr.length() - 1;
        char symbolFromString;

        for (int i = sizeString; i >= 0; i--) {
            symbolFromString = inputStr.charAt(i);
            if (Character.isLetter(symbolFromString))
                outputStr.append(symbolFromString);
        }

        return outputStr.toString();
    }
}
