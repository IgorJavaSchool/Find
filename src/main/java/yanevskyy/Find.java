package yanevskyy;

import yanevskyy.valid.*;

import java.io.*;

/**
 * Finds files into catalog by taken key, and by taken path to the file, amd by taken file's name
 * or mask or regexp.
 */
public class Find {
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String[] keysCommands;
  String pathFile;
  String nameFile;
  String logFile;
  String keyFind;
  boolean valid;

  public Find() {
    this.valid = true;
  }

  public boolean isValid() {
    return valid;
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }

  /**
   * Selects find a way. Finds with by file's name or masc or regexp.
   */
  public void selectAction() {
    System.out.println("Enter data to search");
    try {
      keysCommands = reader.readLine().split(" ");
    if (keysCommands.length != 6) {
      System.out.println("The data is not correct");
      return;
    }
    if (validOperations()){
        Writer writer = new FileWriter(new File(logFile));
      switch (keyFind){
        case "-f" : writer.write(new FindName(pathFile, nameFile).findName());
          break;
        case "-m" : writer.write(new FindMask(pathFile, nameFile).findMask());
          break;
        case "-r" : writer.write(new FindReg(pathFile, nameFile).findRegExp());
          break;
        default:break;
      }
      writer.flush();
      writer.close();
    }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Checks all keys taken from user.
   * @return
     */
  public boolean validOperations(){
    String element;
    for (int i = 0; i < keysCommands.length; i++) {
      element = keysCommands[i];
      if (isValid()) {
        switch (i) {
          case 0: setValid(element.equals("-d"));
            break;
          case 1: setValid(new ValidPath().validKey(element));
            pathFile = element;
            break;
          case 2: setValid(new ValidKeyName().validKey(element));
            keyFind = element;
            break;
          case 3: setValid(new SelectValidName().validKey(keyFind, element));
            nameFile = element;
            break;
          case 4: setValid(element.equals("-o"));
            break;
          case 5: setValid(new ValidLog().validKey(element));
            logFile = element;
            break;
          default: setValid(false);
        }
      }
    }
    return isValid();
  }

  public static void main(String[] args) {
    Find find = new Find();
    find.selectAction();
  }
}