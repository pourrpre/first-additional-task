package ru.ugleva.firstaddtask._main;

import ru.ugleva.firstaddtask.service.ResultWriterService;
import ru.ugleva.firstaddtask.util.Calculator;

public class _Main {

    public static void main(String[] args) {
        int firstNumber = 38;    // первое число
        int secondNumber = 14;   // второе число

        int calcResult = Calculator.sum(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber, secondNumber, calcResult, "Сумма чисел", "равна");
        calcResult = Calculator.subtract(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber, secondNumber, calcResult, "Разность чисел", "равна");
        calcResult = Calculator.multiply(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber, secondNumber, calcResult, "Произведение чисел", "равно");
    }
}
