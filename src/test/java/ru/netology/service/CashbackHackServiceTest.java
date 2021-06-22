package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService bonus = new CashbackHackService();

    @Test
    public void shouldBe0() {
        int actual = bonus.remain(0);
        int expected = 1000;

        assertEquals(actual, expected, "remain if 0");
    }

    @Test
    public void shouldbe1100() {
        int actual = bonus.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBe1000() {
        int actual = bonus.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}
