import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Bidhan on 31/10/2015.
 */

public class Simpletest {
@BeforeClass
public void beforeClass() {
        // code that will be invoked when this test is instantiated
        }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("This is a fast test");
    }
    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("This is a slow test");
    }
}
