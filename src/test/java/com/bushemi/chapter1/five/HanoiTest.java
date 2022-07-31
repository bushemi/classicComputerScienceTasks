package com.bushemi.chapter1.five;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class HanoiTest {

    @Test
    public void should_resolve_hanoi() {
        //given
        Hanoi towers = new Hanoi(3);
        List<Integer> expectedTower = new LinkedList<>(asList(1, 2, 3));
        assertThat(towers.towerA.size(), is(equalTo(3)));
        assertThat(towers.towerB.size(), is(equalTo(0)));
        assertThat(towers.towerC.size(), is(equalTo(0)));
        assertThat(towers.towerA, is(equalTo(expectedTower)));

        //when
        towers.solve();

        //then
        assertThat(towers.towerA.size(), is(equalTo(0)));
        assertThat(towers.towerB.size(), is(equalTo(0)));
        assertThat(towers.towerC.size(), is(equalTo(3)));
        assertThat(towers.towerC, is(equalTo(expectedTower)));
    }

}