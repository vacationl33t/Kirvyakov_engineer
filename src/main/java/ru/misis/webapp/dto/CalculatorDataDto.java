package ru.misis.webapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorDataDto {

    private Double firstNumber;

    private String operand;

    private Double secondNumber;
}
