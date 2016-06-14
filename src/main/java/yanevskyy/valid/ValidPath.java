package yanevskyy.valid;

import java.io.File;

/**
 * Created by MM on 12.06.2016.
 */

/**
 * Checks path to the file.
 */
public class ValidPath implements Validator  {

    /**
     * Checks whether there is path to the file.
     * @param path path to the file.
     * @return
     */
    @Override
    public boolean validKey(String path) {
        if (new File(path).isDirectory()){
            return true;
        } else {
            System.out.println("Path to file is not correct");
            return false;
        }
    }
}
