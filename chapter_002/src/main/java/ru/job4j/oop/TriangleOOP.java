package ru.job4j.oop;

public class TriangleOOP {
    private Point first;
    private Point second;
    private Point third;

    public TriangleOOP(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Перимент.
     */
    public double period(double a, double b, double c) {
        double v = a + b + c;
        double w = v / 2;
        return w;
    }
    /**
     * Метод должен вычислить прощадь треугольканива.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    public static boolean exist(double a, double c, double b) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (b + c > a) && (a + c > b);
    }
}
