package yanevskyy.valid;

/**
 * Created by MM on 12.06.2016.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Checks valid name for log file.
 */
public class ValidLog implements Validator {

    /**
     * Checks that name lod file contain in the end ".txt"
     * @param logName
     * @return
     */
    @Override
    public boolean validKey(String logName) {
        boolean result = check("^(.)+\\.txt$", logName);
        if (!result)
            System.out.println("Name log file is not correct");
        return result;
    }

    public boolean check(String regExp, String text){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
