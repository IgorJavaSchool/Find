package yanevskyy;


import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds all files into directory with by file's name.
 */
public class FindReg extends FindFile {
    public FindReg(String path, String name) {
        super(path, name);
    }

    /**
     * Finds all files into the directory and into all subdirectory with by regexp.
     * @return
     */
    public String findRegExp(){
        listFile = new File(path).listFiles();
        for (File file : listFile) {
            if (file.isDirectory()) {
                filesPath.append(new FindReg(file.getPath(), nameFind).findRegExp());
            } else if (check(nameFind,file.getName())){
                filesPath.append("Найден Файл: ");
                filesPath.append(file.getPath() + "\n");
            }
        }
        return filesPath.toString();
    }

    public boolean check(String regExp, String text){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}