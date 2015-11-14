package unittest;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bidhan on 13/11/2015.
 */
public class statementtest {
    @Test
    public void statements(){
        assertEquals(4, 2+2);
        assertEquals("2+3 always =4",4,2+2);
    }
}
