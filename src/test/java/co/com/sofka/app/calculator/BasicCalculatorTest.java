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
    @DisplayName("Testing resta 2-1=1")
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
    @DisplayName("Testing division 4/2=2")
    void division() {

        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue=2L;

        // Act
        long result= basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplicacion ---> 4*2=8")
    void multiplicacion() {

        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue=8L;

        // Act
        long result= basicCalculator.multiplicacion(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}