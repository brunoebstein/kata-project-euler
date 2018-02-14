import java.io.Console;
import java.util.*;

public class PrimeCalculator {
    public static long largestPrime(long number) {
        /*
        return _largestPrime(number);
        /*/
        for (long largestPrime = number - 1; largestPrime >= 2; largestPrime--)
            if (number % largestPrime == 0)
                return largestPrime(largestPrime);
        return number;
        /**/
    }

    public static long _largestPrime(long number) {
        Stack<Long> already = new Stack<>();

        long biggestPrime = 2;
        while (biggestPrime != number) {
            if (number % biggestPrime == 0) {
                System.out.println("factor" + biggestPrime);
                if (already.contains(biggestPrime)) {
                    return biggestPrime;
                }
                already.push(biggestPrime);
                biggestPrime = number / biggestPrime;
            }
            else {
                System.out.println("not factor" + biggestPrime);
                biggestPrime++;
            }
        }
        System.out.println(already);
        return already.empty() ? number : already.peek();
    }
}
