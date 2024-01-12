package ru.misis.webapp.service;

import org.junit.jupiter.api.Test;
import ru.misis.webapp.dto.CalculatorDataDto;
import ru.misis.webapp.dto.ResultDto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class CalculatorServiceTest {


    @Test
    void calculateAddition() {
        CalculatorDataDto calculatorData = new CalculatorDataDto(5.0, "ADD", 3.0);

        ResultDto resultDto = new CalculatorService().calculate(calculatorData);

        assertEquals(8.0, resultDto.getResult());
    }


    @Test
    void calculateSubtraction() {
        CalculatorDataDto calculatorData = new CalculatorDataDto(8.0, "SUBTRACT", 3.0);

        ResultDto resultDto = new CalculatorService().calculate(calculatorData);

        assertEquals(5.0, resultDto.getResult());
    }


    @Test
    void calculateMultiplication() {
        CalculatorDataDto calculatorData = new CalculatorDataDto(4.0, "MULTIPLY", 2.0);

        ResultDto resultDto = new CalculatorService().calculate(calculatorData);

        assertEquals(8.0, resultDto.getResult());
    }


    @Test
    void calculateDivision() {
        CalculatorDataDto calculatorData = new CalculatorDataDto(9.0, "DIVIDE", 3.0);

        ResultDto resultDto = new CalculatorService().calculate(calculatorData);

        assertEquals(3.0, resultDto.getResult());
    }


    @Test
    void calculateUnknownOperation() {
        CalculatorDataDto calculatorData = new CalculatorDataDto(5.0, "UNKNOWN", 3.0);

        ResultDto resultDto = new CalculatorService().calculate(calculatorData);

        assertNull(resultDto.getResult());
    }
}
