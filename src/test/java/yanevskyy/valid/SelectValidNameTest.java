package yanevskyy.valid;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MM on 14.06.2016.
 */
public class SelectValidNameTest {
    @Test
    public void validKey() throws Exception {
        SelectValidName selectValidName = new SelectValidName();
        String key = "-r";
        String reg = "[A-z]+\\.[a-z]+";
        boolean result = true;

        assertEquals(result, selectValidName.validKey(key, reg));

        key = "-r";
        reg = "(.";
        result = false;

        assertEquals(result, selectValidName.validKey(key, reg));

        key = "-m";
        reg = "*.?xt";
        result = true;

        assertEquals(result, selectValidName.validKey(key, reg));

        key = "-m";
        reg = "*";
        result = false;


        assertEquals(result, selectValidName.validKey(key, reg));

        key = "-m";
        reg = "*.*";
        result = true;


        assertEquals(result, selectValidName.validKey(key, reg));

        key = "-f";
        reg = "qwerty.txt";
        result = true;


        assertEquals(result, selectValidName.validKey(key, reg));

        key = "-f";
        reg = "qwerty";
        result = false;


        assertEquals(result, selectValidName.validKey(key, reg));

    }

}