package ru.ugleva.firstaddtask._main;

import ru.ugleva.firstaddtask.service.ResultWriterService;

import static ru.ugleva.firstaddtask.util.Calculator.*;

public class _Main {

    public static void main (String[] args) {
        int firstNumber = 38;    // первое число
        int secondNumber = 14;   // второе число
        int calcResult = sum(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber,secondNumber, calcResult, "Сумма чисел", "равна");
        calcResult = subtract(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber,secondNumber, calcResult, "Разность чисел", "равна");
        calcResult = multiply(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber,secondNumber, calcResult, "Произведение чисел", "равно");
    }
}
