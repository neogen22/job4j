package ru.job4j.converter;

/**
 * Конвертер валюты.
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {		
        return value * 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value * 60;
    }
	public int euroToRuble(int value) {
        return value / 70;
    }
	public int dollarToRuble(int value) {
        return value / 60;
    }
}