package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum ---> 1+1=2")
    void suma() {

        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue=2L;

        // Act
       long result= basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    void resta() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 1L;
        Long expectedValue=1L;

        // Act
        long result= basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    void division() {
    }

    @Test
    void multiplicacion() {
    }
}