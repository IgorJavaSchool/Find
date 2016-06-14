package yanevskyy.valid;

/**
 * Created by MM on 12.06.2016.
 */

/**
 * Checks valid file's name.
 */
public class ValidName implements Validator  {

    /**
     * Checks that last dot would not be at the beginning or end of the world.
     */
    @Override
    public boolean validKey(String name) {
        char[] charsName = name.toCharArray();
        int point = name.lastIndexOf(".");
        if (point == 0 || point == charsName.length - 1) {
            System.out.println("File name is not correct");
            return false;
        } else return true;
    }
}
