package my.unit.test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestDemoJUniTest2 {
    

    @Test
    void testRandomNumberSquared() {
        TestDemo2 testDemo = new TestDemo2();
        int result = testDemo.randomNumberSquared();

        // Check if the result is between 1 and 100 (both inclusive)
        Assert.assertTrue(result >= 1 && result <= 100);

        // Additionally, you could assert the result is a perfect square
        Assert.assertTrue(isPerfectSquare(result));
    }

    // Helper method to check if a number is a perfect square
    private boolean isPerfectSquare(int number) {
        if (number < 0) return false;
        int sqrt = (int) Math.sqrt(number);
        return number == sqrt * sqrt;
    }
}
