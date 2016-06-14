package yanevskyy.valid;

/**
 * Created by MM on 12.06.2016.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        boolean result = check("^(.)+\\.(.)+$", mask);
        if (result)
            result = mask.contains("*") || mask.contains("?");
        if (!result)
            System.out.println("Mask is not correct");
        return result;
    }

    public boolean check(String regExp, String text){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
