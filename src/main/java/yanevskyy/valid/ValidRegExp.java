package yanevskyy.valid;

import java.util.regex.Pattern;

/**
 * Created by MM on 12.06.2016.
 */

/**
 * Checks valid regexp.
 */
public class ValidRegExp implements Validator {

    /**
     * Checks valid regexp and checks parameter is empty.
     * @param regExp
     * @return
     */
    @Override
    public boolean validKey(String regExp) {
        if (regExp.isEmpty()){
            System.out.println("RegExp name is not correct");
            return false;
        } else {
            try {
                Pattern pattern = Pattern.compile(regExp);
            } catch (Exception e) {
                System.out.println("RegExp name is not correct");
                return false;
            }
            return true;
        }
    }
}
