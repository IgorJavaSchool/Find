package yanevskyy.valid;

/**
 * Created by MM on 13.06.2016.
 */

/**
 * Checks valid key for file's name.
 */
public class ValidKeyName implements Validator {

    @Override
    public boolean validKey(String string) {
        switch (string){
            case "-f" : return true;
            case "-m" : return true;
            case "-r" : return true;
            default: return false;
        }
    }
}
