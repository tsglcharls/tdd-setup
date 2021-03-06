package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());

    }
    @Test
    @DisplayName("should display result clear")
    void pressClearKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(4);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after negative")
    void pressNegative() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(4);
        calc.pressNegative();
        assertEquals("-4", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after using operation -")
    void pressDotKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(4);
        calc.pressOperationKey("-");
        calc.pressDigitKey(4);
        calc.pressOperationKey("-");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("-4", calc.readScreen());
    }
}
