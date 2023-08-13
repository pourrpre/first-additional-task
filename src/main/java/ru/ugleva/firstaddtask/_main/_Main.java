package ru.ugleva.firstaddtask._main;

import ru.ugleva.firstaddtask.service.ResultWriterService;

import static ru.ugleva.firstaddtask.util.Calculator.*;

public class _Main {

    public static void main (String[] args) {
        int firstNumber = 38;    // ������ �����
        int secondNumber = 14;   // ������ �����
        int calcResult = sum(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber,secondNumber, calcResult, "����� �����", "�����");
        calcResult = subtract(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber,secondNumber, calcResult, "�������� �����", "�����");
        calcResult = multiply(firstNumber, secondNumber);
        ResultWriterService.printResult(firstNumber,secondNumber, calcResult, "������������ �����", "�����");
    }
}
