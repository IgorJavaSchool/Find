package yanevskyy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MM on 13.06.2016.
 */
public class FindRegTest {
    @Test
    public void findRegExp() throws Exception {
        String path = "C:\\Users\\MM\\Documents\\test";
        String name = "[a-z]+\\.[a-z]+";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Найден Файл: C:\\Users\\MM\\Documents\\test\\Chat\\qwerty.txt\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Chess\\bishops.java\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Chess\\king.java\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Chess\\knights.java\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Chess\\pawns.java\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Chess\\queen.java\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Chess\\rooks.java\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Find\\qqq\\qwerty.txt\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\qwerty.txt\n" +
                "Найден Файл: C:\\Users\\MM\\Documents\\test\\Socket\\qwerty.txt\n");

        String result = new FindReg(path, name).findRegExp();

        assertEquals(result, stringBuilder.toString());
    }

}