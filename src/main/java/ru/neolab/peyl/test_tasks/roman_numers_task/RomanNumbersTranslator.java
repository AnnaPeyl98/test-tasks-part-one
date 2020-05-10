package ru.neolab.peyl.test_tasks.roman_numers_task;

/**
 * Class for converting from decimal notation to the Roman numeral system
 */
public class RomanNumbersTranslator {
    private static final int MIN_ROMAN_NUMBER = 1;
    private static final int MAX_ROMAN_NUMBER = 3999;
    private ArraysRomanNumber romanNumberConverter;

    /**
     * Constructor for creating roman number converter, which contains arrays with numbers
     */

    public RomanNumbersTranslator() {
        romanNumberConverter = new ArraysRomanNumber();
    }

    /**
     * Method converts decimal number to roman
     *
     * @param num - decimal number for converting
     * @return - num converted to roman number
     * @throws RomanNumberTranslatorException if num is less than or equal to zero or greater than 3999
     *                                        (according to the rules of the Roman numeral system, numbers greater than
     *                                        3999 can not be translated)
     */

    public String getRomeNum(final int num) throws RomanNumberTranslatorException {
        if (num < MIN_ROMAN_NUMBER || num > MAX_ROMAN_NUMBER) {
            throw new RomanNumberTranslatorException("The number must be in the range 1 to 3999 inclusive");
        }
        StringBuilder res = new StringBuilder();
        int countArabicNumbers = romanNumberConverter.getCountArabicNumbers();
        int number = num;
        for (int i = 0; i < countArabicNumbers; i++) {
            while (number >= romanNumberConverter.getArabicNumber(i)) {
                number -= romanNumberConverter.getArabicNumber(i);
                res.append(romanNumberConverter.getRomanNumber(i));
            }
        }
        return res.toString();
    }

}
