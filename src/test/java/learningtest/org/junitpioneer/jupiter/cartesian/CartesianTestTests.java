package learningtest.org.junitpioneer.jupiter.cartesian;

import org.junitpioneer.jupiter.cartesian.CartesianTest;

import java.time.temporal.ChronoUnit;

/**
 * Tests for {@link CartesianTest}.
 *
 * @author Johnny Lim
 */
class CartesianTestTests {

    @CartesianTest
    void test(@CartesianTest.Enum ChronoUnit unit, @CartesianTest.Values(booleans = { false, true }) boolean b) {
        System.out.printf("Testing with %s and %s%n", unit, b);
    }

}
