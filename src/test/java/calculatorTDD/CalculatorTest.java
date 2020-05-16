package calculatorTDD;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers() {
        //given
        Double a = 1.0;
        Double b = 2.0;
        Double expectedValue = 3.0;

        //when
        Double sum = calculator.add(a, b);

        //then
        assertEquals(expectedValue, sum);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        //given
        Double a = 1.0;
        Double b = 2.0;
        Double expectedValue = -1.0;

        //when
        Double sum = calculator.subtract(a, b);

        //then
        assertEquals(expectedValue, sum);
    }

    @Test
    void shouldCalculateTheGivenPowerOfGivenNumber() {
        //given
        Double a = 3.0;
        Double x = 2.0;
        Double expectedValue = 9.0;

        //when
        Double sum = calculator.pow(a, x);

        //then
        assertEquals(expectedValue, sum);
    }

    @Test
    void ShouldCalculateSquareRootOfNumber() {
        //given
        Double a = 9.0;
        Double expectedValue = 3.0;

        //when
        Double sum = calculator.sqrt(a);

        //then
        assertEquals(expectedValue, sum);
    }
}