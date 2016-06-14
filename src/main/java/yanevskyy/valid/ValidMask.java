package yanevskyy.valid;

/**
 * Created by MM on 12.06.2016.
 */

/**
 * Checks that data directory symbol
 *
 */
public class ValidMask implements Validator {

    /**
     * Checks that last dot would not be at the beginning or end of the world.
     * Checks that taken mask contain symbol "*" or "?".
     * @param mask
     * @return
     */
    @Override
    public boolean validKey(String mask) {
        char[] charsName = mask.toCharArray();
        int point = mask.lastIndexOf(".");
        if (point == 0 || point == charsName.length - 1) {
            System.out.println("File name is not correct");
            return false;
        } else {
            for (char part : charsName) {
                if ((part == '*') || (part == '?')) {
                    return true;
                }
            }
            return false;
        }
    }
}
