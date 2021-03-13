package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1,2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then1() {
        int result = Max.max(1,1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2,1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1and2Then3() {
        int result = Max.max(3,2,1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3and4To1and2Then4() {
        int result = Max.max(3, 4,2,1);
        assertThat(result, is(4));
    }


}