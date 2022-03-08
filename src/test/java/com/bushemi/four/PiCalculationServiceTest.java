package com.bushemi.four;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class PiCalculationServiceTest {
    private final PiCalculationService service = new PiCalculationService();

    @Test
    public void should_calculate_pi() {
        //given
        //when
        double pi = service.calculatePi(100000);

        //then
        assertThat(String.valueOf(pi).substring(0, 4), is(equalTo("3.14")));
    }

}