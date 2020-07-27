package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldCalculateHowMuchBuy() {
        CashbackHackService bonusService= new CashbackHackService();
        int amount = 900;
        int actual = bonusService.remain(amount);
        int expected = 100;
        assertEquals (actual,expected);

    }
    @Test
    void shouldCalculateHowMuchBuy2() {
        CashbackHackService bonusService= new CashbackHackService();
        int amount = 0;
        int actual = bonusService.remain(amount);
        int expected = 1000;
        assertEquals (actual,expected);

    }
}
