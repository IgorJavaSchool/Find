package yanevskyy.valid;

/**
 * Created by MM on 12.06.2016.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Checks valid file's name.
 */
public class ValidName implements Validator  {

    /**
     * Checks that last dot would not be at the beginning or end of the world.
     */
    @Override
    public boolean validKey(String name) {
        boolean result = check("^(.)+\\.(.)+$", name);
        if (!result)
            System.out.println("File name is not correct");
        return result;
    }

    public boolean check(String regExp, String text){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
