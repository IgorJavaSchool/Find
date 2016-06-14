package yanevskyy;

import java.io.File;

/**
 * Contains path of the file and file's name or mask or regexp.
 * The same way contains list with all files and directory are found.
 */
public abstract class FindFile {
  String path;
  String nameFind;
  File[] listFile;
  StringBuilder filesPath;

  public FindFile(String path, String name) {
    this.path = path;
    this.nameFind = name;
    filesPath = new StringBuilder();
  }

}