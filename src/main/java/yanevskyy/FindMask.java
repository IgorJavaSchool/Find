package yanevskyy;

/**
 * Find files with by mask.
 */
public class FindMask extends FindFile {

    public FindMask(String path, String name) {
        super(path, name);
    }

    /**
     * Makes regexp in which changes "*" symbol on any other. Or changes "?" symbol on one other.
     * @return
     */
    public String findMask() {
        char[] charsName = nameFind.toCharArray();
        StringBuilder regExp = new StringBuilder();
        regExp.append("^(");
        for (int i = 0; i < charsName.length; i++) {
            if (charsName[i] == '*') {
                regExp.append("(.+)");
            } else if (charsName[i] == '?') {
                regExp.append("(.)");
            } else if (charsName[i] == '.') {
                regExp.append("(\\.)");
            } else regExp.append(charsName[i]);
        }
        regExp.append(")$");
        filesPath.append(new FindReg(path, regExp.toString()).findRegExp());
        return filesPath.toString();
    }
}