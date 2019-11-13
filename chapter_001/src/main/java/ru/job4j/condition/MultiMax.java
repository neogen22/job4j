package ru.job4j.condition;
public class MultiMax {
    public int max(int first, int second, int third) {
        int resultprev = first < second ? second : first;
        int result = resultprev < third ? third : resultprev;
		return result;
    }
}