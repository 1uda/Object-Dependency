package ru.netology.pm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test() {
        PosterManager manager = new PosterManager();

        manager.add("Bloodshot");
        manager.add("Onwards");
        manager.add("Hotel 'Belgrade'");
        manager.add("The Gentlemen");
        manager.add("Invisible Man");
        manager.add("Trolls. World tournament");
        manager.add("Number one");


        String[] expected = {"Bloodshot", "Onwards", "Hotel 'Belgrade'", "The Gentlemen", "Invisible Man", "Trolls. World tournament", "Number one"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void lastTest() {
        PosterManager manager = new PosterManager();

        manager.add("Bloodshot");
        manager.add("Onwards");
        manager.add("Hotel 'Belgrade'");
        manager.add("The Gentlemen");
        manager.add("Invisible Man");
        manager.add("Trolls. World tournament");
        manager.add("Number one");


        String[] expected = {"Number one", "Trolls. World tournament", "Invisible Man", "The Gentlemen", "Hotel 'Belgrade'", "Onwards", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
