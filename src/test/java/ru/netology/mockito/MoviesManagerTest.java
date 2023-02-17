package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    MoviesManager manager = new MoviesManager();

    @Test
    public void AddThreeTest() {

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void AddOneTest() {

        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddAllThreeTest() {

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        manager.findAll();

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddAllNothingTest() {

        manager.findAll();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddContTest() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        manager.findLast();

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddContEqualTest() {
        MoviesManager manager = new MoviesManager(2);

        manager.add("Film I");
        manager.add("Film II");

        manager.findLast();

        String[] expected = {"Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}