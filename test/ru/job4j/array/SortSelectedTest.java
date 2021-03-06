package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {12, 2, 1000};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 12, 1000};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {12, 65, 10, 3, 1000000};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {3, 10, 12, 65, 1000000};
        assertThat(result, is(expect));
    }
}