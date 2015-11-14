package unittest;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Bidhan on 13/11/2015.
 */
public class Stringtest {

    @Test
    public void stringsConcatenated(){
        assertEquals("123456","12"+"34"+"56");
    }

    @Test
    public void someStringmethod(){
        String aString="abcdef";
        assertEquals(6,aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDE")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
        aString.charAt(2);
        assertEquals("ef",aString.substring(4));

    }
}
