import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ProjectEulerShould {
    @Test
    @Parameters({"17", "2"})
    public void returnItselfWhenPrimeNumber(long primeNumber) {
        assertThat(PrimeCalculator.largestPrime(primeNumber)).isEqualTo(primeNumber);
    }

    @Test
    @Parameters({
            "4,2",
            "6,3",
            "8,2",
            "24,3",
            "35,7",
            "13195,29",
            // "67858560,17",
            // "600851475143,2",
    })
    public void returnBiggestPrimeNumber(long notPrime, long largestPrimeFactor) {
        assertThat(PrimeCalculator.largestPrime(notPrime)).isEqualTo(largestPrimeFactor);
    }

}
