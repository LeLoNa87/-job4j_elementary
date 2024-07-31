package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GamesTest {

    @Test
    void whenPermissionThenIsAllowByParentAndIsHasMoney() {

        ByteArrayOutputStream actual = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actual));

        Games.permission(true, true);
        assertEquals("I can go to the computer club." + System.lineSeparator(), actual.toString());
    }

    @Test
    void  whenPermissionThenIsByParentAndIsHasMoney() {

        ByteArrayOutputStream actual = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actual));

        Games.permission(false, false);
        assertEquals("I can't." + System.lineSeparator(), actual.toString());
    }
}