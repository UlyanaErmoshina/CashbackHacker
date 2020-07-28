package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateHowMuchBuy() {
        CashbackHackService bonusService= new CashbackHackService();
        int amount = 900;
        int actual = bonusService.remain(amount);
        int expected = 100;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateHowMuchBuy2() {
        CashbackHackService bonusService= new CashbackHackService();
        int amount = 0;
        int actual = bonusService.remain(amount);
        int expected = 1000;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateHowMuchBuy3() {
        CashbackHackService bonusService= new CashbackHackService();
        int amount = 1000;
        int actual = bonusService.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
}
