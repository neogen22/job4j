package ru.job4j.loop;
//Метод должен вычислять сумму четныx чисел в диапазоне от start до finish;
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        int z = 0;
        int z2 = 0;
        for (; start <= finish; start++) {
            z = start % 2 == 0 ? start : 0;
            z2+=z;
        }
        sum = z2;
        return sum;
    }
}





