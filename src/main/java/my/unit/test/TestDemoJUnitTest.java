package my.unit.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemoJUnitTest {
    private final TestDemo testDemo = new TestDemo();

    @Test
    public void testAddPositive() {
       
        Assert.assertEquals(testDemo.addPositive(4, 5), 9);
        Assert.assertEquals(testDemo.addPositive(40, 50), 90);
        Assert.assertEquals(testDemo.addPositive(1, 1), 2);
        Assert.assertEquals(testDemo.addPositive(100, 200), 300);
        Assert.assertEquals(testDemo.addPositive(999, 1), 1000);
        Assert.assertEquals(testDemo.addPositive(0, 10), 10);
        Assert.assertEquals(testDemo.addPositive(7, 8), 15);
        Assert.assertEquals(testDemo.addPositive(15, 25), 40);
    }
    
    }
