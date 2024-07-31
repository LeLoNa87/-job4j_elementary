package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    @Test
    void whenPermissionThanIsHasMoneyAndIsBeFriend() {

        ByteArrayOutputStream actual = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actual));

        Club.permission(true, true);
        assertEquals("I cant go to the club." + System.lineSeparator(), actual.toString());
    }
}