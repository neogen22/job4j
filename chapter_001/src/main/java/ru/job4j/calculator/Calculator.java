package ru.job4j.calculator;

public class Calculator {
    /** @value add - сложение
     * @value subtract - вычитание
     * @value div - деление
     * @value multiple - умножение
     * */
    public double add(double first, double second) {
        return first + second;
    }
	public double subtract(double first, double second) {
        return first - second;
    }
	public double div(double first, double second) {
        return first / second;
    }
	public double multiple(double first, double second) {
        return first * second;
    }
}