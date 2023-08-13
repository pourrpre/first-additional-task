package ru.ugleva.firstaddtask._main;

import ru.ugleva.firstaddtask.service.ResultWriterService;
import ru.ugleva.firstaddtask.util.Calculator;

public class _Main {

    public static void main(String[] args) {
        int firstNumber = 38;    // ������ �����
        int secondNumber = 14;   // ������ �����

        int calcResult = Calculator.sum(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber, secondNumber, calcResult, "����� �����", "�����");
        calcResult = Calculator.subtract(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber, secondNumber, calcResult, "�������� �����", "�����");
        calcResult = Calculator.multiply(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber, secondNumber, calcResult, "������������ �����", "�����");
    }
}
