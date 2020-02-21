package ru.job4j.oop;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Point3DTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point3D a = new Point3D(2, 1, 4);
        Point3D b = new Point3D(4, 2, 6);

        double result = a.distance3d(b);
        assertThat(result, is(3.0));
    }
}
