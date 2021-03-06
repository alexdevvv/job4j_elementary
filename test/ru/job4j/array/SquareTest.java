package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound5Then14916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = {0, 1, 4, 9, 16};
        assertThat(rst, is(rst));
    }
}