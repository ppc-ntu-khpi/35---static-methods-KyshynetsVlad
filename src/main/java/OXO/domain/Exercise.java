
package domain;
public class Exercise {
    /**
     * The method that calculates our variable
     * @param s variable that outputs the result
     * @return the number that summed up from the date of birth
     */
    public static String Calculate(String s) { 
        /**
         * While the length of the date sum is greater than one
         */
        while (s.length() > 1) { 
            /**
             * Initially the sum is zero
             */
            int sum = 0;
            /**
             * Date check cycle
             */
            for (char c : s.toCharArray()) {
                /**
                 * Checking that one digit is equal to one character
                 */
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                }
            }
            /**
             * A variable in which a finite number from the sum of the date of birth
             */
            s = String.valueOf(sum);
        }
        return s;
    }
}
