import org.junit.Assert;
import org.junit.Test;

public class DirectorTest {

    @Test
    public void test() {
        SetMeal director = new Director().construct(new CrazyThursdayBuilder());
        Assert.assertSame(director.getChicken(), "香辣yun指鸡");
    }

}