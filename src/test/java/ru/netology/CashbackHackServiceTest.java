package ru.netology;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain_amount0byMore1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemain_amount980byMore20() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(980);
        int expected = 20;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemain_amount1000byMore0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
