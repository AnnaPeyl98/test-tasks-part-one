package ru.neolab.peyl.test_tasks.roman_numers_task;

/**
 * Class for storing arrays of Arabic and Roman numbers for translation from Arabic to Roman numeral system.
 */
public class ArraysRomanNumber {
    private int[] arabicNumbers;
    private String[] romanNumbers;

    /**
     * Constructor creates Arabic and Roman numbers necessary for algorithm to work
     */

    public ArraysRomanNumber() {
        arabicNumbers = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        romanNumbers = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    }

    /**
     * Method to get arabic number from array by index
     *
     * @param i - index arabic number
     * @return arabic number from array for index i
     */

    public int getArabicNumber(final int i) {
        return arabicNumbers[i];
    }

    /**
     * Method to get roman number from array by index
     *
     * @param i - index roman number
     * @return roman number from array for index i
     */

    public String getRomanNumber(final int i) {
        return romanNumbers[i];
    }

    /**
     * Method returns count arabic number in array
     *
     * @return count arabic number
     */

    public int getCountArabicNumbers() {
        return arabicNumbers.length;
    }
}
