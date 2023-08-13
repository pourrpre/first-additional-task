package ru.ugleva.firstaddtask.service;

public class ResultWriterService {

    public static void printResult(int firstNumber, int secondNumber, int calcResult, String calcName, String equals) {
        System.out.println(calcName + " " + firstNumber + " è " + secondNumber + " " + equals + " " + calcResult);
    }
}
