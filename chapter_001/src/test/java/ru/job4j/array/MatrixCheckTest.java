package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenchetDataMonoByFalseThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, true},
                {false, true, true, false},
                {true, false, true, false},
                {true, false, true, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whechetDataMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, false},
                {false, true, true, false},
                {true, false, true, false},
                {true, false, true, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whechetDataMonoByTrueThenFalseFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, true},
                {false, true, true, false},
                {true, true, true, false},
                {true, false, true, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void lowlevelwhechetDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true},
                {true, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void lowlevelwhechetDataMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {true, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void lowlevelwhechetDataMonoByTrueThenFalse2() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {false, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void masswhechetDataMonoByTrueThenFalseFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, true, false, false, true, true},
                {false, true, true, false, false, true, true, false},
                {true, true, true, false, false, true, true, false},
                {true, true, true, true, true, false, true, false},
                {true, true, true, false, true, false, true, false},
                {true, true, true, false, false, true, true, false},
                {true, true, true, false, false, false, true, false},
                {true, true, true, false, false, false, true, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void masswhechetDataMonoByTrueThenFalseFalse2() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, true, true, false, false, true, false},
                {false, false, true, false, false, true, false, false},
                {true, true, false, false, false, false, true, false},
                {true, true, true, false, false, false, true, false},
                {true, true, true, false, false, false, true, false},
                {true, true, false, false, false, false, true, false},
                {true, false, true, false, false, false, false, false},
                {false, true, true, false, false, false, true, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }


}