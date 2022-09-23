import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void getProductTest() {
        Assert.assertNotNull(Factory.getProductByType("A"));
        Assert.assertNotNull(Factory.getProductByType("C"));
        Assert.assertNull(Factory.getProductByType(""));
    }

}