package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1thenMonday() {
        int i = 1;
        String out = SwitchWeek.nameOfDay(i);
        String expected = "Понедельник";
        Assert.assertEquals(out, expected);
    }

    @Test
    public void when1thenTuesday() {
        int i = 2;
        String out = SwitchWeek.nameOfDay(i);
        String expected = "Вторник";
        Assert.assertEquals(out, expected);
    }

    @Test
    public void when8thenError() {
        int i = 8;
        String out = SwitchWeek.nameOfDay(i);
        String expected = "Ошибка";
        Assert.assertEquals(out, expected);
    }
}