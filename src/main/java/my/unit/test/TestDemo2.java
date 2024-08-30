package my.unit.test;

import java.util.Random;

public class TestDemo2 {
    public int randomNumberSquared() {
        int randomInt = getRandomInt();
        return randomInt * randomInt;
    }

    int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}

