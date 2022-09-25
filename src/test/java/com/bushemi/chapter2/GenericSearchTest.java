package com.bushemi.chapter2;

import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GenericSearchTest {
    @Test
    public void should_find_contains_via_linear() {
        //given
        List<Integer> list = List.of(1, 5, 15, 15, 15, 15, 20);
        int key = 5;
        //when
        boolean linearContains = GenericSearch.linearContains(list, key);
        //then
        assertThat(linearContains, is(Boolean.TRUE));
    }

    @Test
    public void should_find_contains_via_binary() {
        //given
        List<String> list = List.of("a", "d", "e", "f", "z");
        String key = "f";
        //when
        boolean linearContains = GenericSearch.linearContains(list, key);
        //then
        assertThat(linearContains, is(Boolean.TRUE));
    }

    @Test
    public void should_not_find_contains_via_binary() {
        //given
        List<String> list = List.of("john", "mark", "ronald", "sarah");
        String key = "sheila";
        //when
        boolean linearContains = GenericSearch.linearContains(list, key);
        //then
        assertThat(linearContains, is(Boolean.FALSE));
    }
}