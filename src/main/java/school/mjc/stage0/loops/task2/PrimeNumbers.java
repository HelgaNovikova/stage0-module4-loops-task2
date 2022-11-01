package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i < printToInclusive + 1) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime == true) {
                System.out.println(i);
            }
            i++;
        }


    }
}
