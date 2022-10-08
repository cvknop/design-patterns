import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jhuan
 */
public class SingletonTest {

    @Test
    public void singletonTest() {
      Assert.assertSame(Singleton.getInstance(),Singleton.getInstance());
    }

}