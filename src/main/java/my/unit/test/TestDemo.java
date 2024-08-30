
package my.unit.test;

import org.testng.annotations.Test;

public class TestDemo {
    @Test
   public int addPositive(int a, int b) {
    if (a > 0 && b > 0) {
        return a + b;
    } else {
        throw new
        IllegalArgumentException("Both parameters must be positive!"
        );
    }
    }
}


