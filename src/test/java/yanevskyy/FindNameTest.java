package yanevskyy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MM on 13.06.2016.
 */
public class FindNameTest {
    @Test
    public void findName() throws Exception {
        String path = "C:\\Users\\MM\\Documents\\test";
        String name = "qwerty.txt";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Найден Файл: ");
        stringBuilder.append("C:\\Users\\MM\\Documents\\test\\Chat\\qwerty.txt" + "\n");
        stringBuilder.append("Найден Файл: ");
        stringBuilder.append("C:\\Users\\MM\\Documents\\test\\Find\\qqq\\qwerty.txt" + "\n");
        stringBuilder.append("Найден Файл: ");
        stringBuilder.append("C:\\Users\\MM\\Documents\\test\\qwerty.txt" + "\n");
        stringBuilder.append("Найден Файл: ");
        stringBuilder.append("C:\\Users\\MM\\Documents\\test\\Socket\\qwerty.txt" + "\n");

        String result = new FindName(path, name).findName();

        assertEquals(result, stringBuilder.toString());
    }

}