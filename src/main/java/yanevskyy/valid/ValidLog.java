package yanevskyy.valid;

/**
 * Created by MM on 12.06.2016.
 */

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
        String[] partsName = logName.split("[.]");
        if (partsName.length < 2){
            System.out.println("Log file name is not correct");
            return false;
        } else {
            if (partsName[partsName.length - 1].equals("txt")){
                return true;
            } else {
                System.out.println("Log file name is not correct");
                return false;
            }
        }
    }
}
