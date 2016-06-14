package yanevskyy;


import java.io.File;

/**
 * Finds all files into directory with by file's name.
 */
public class FindName extends FindFile {
    public FindName(String path, String name) {
        super(path, name);
    }

    /**
     * Finds all files into the directory and into all subdirectory with by file's name.
     * @return
     */
    public String findName() {
        listFile = new File(path).listFiles();
        for (File file : listFile) {
            if (file.isDirectory()){
                filesPath.append(new FindName(file.getPath(), nameFind).findName());
            }else if (file.getName().equals(nameFind)){
                filesPath.append("Найден Файл: ");
                filesPath.append(file.getPath() + "\n");
            }
        }
        return filesPath.toString();
    }
}