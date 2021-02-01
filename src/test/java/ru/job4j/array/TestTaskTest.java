package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class TestTaskTest {
    @Test
    public void whenOriginContainsSub() {
        TestTask testfirst = new TestTask();
        String[] origin = {"Привет"};
        String[] sub = {"иве"};
        boolean result = testfirst.conteins("Привет", "иве");
        assertThat(result, is(true));
    }
    @Test
    public void whenOriginContainsSub2() {
        TestTask testsecond = new TestTask();
        String[] origin = {"Привет"};
        String[] sub = {"ага"};
        boolean result = testsecond.conteins("Привет", "ага");
        assertThat(result, is(false));
    }
}