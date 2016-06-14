package yanevskyy.valid;

/**
 * Created by MM on 13.06.2016.
 */

/**
 * Checks correctness file's name or mask or regexp.
 */
public class SelectValidName implements Validator{

    /**
     * Checks correctness depending on the taken param.
     * @param key defines which class need for check.
     * @param command file's name or mask or regexp.
     * @return result define.
     */
    public boolean validKey(String key, String command) {
        switch (key){
            case "-f" : return (new ValidName().validKey(command));
            case "-m" : return (new ValidMask().validKey(command));
            case "-r" : return (new ValidRegExp().validKey(command));
            default: return false;
        }
    }

    @Override
    public boolean validKey(String string) {
        return false;
    }
}
