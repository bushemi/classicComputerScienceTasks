package com.bushemi.four;

import org.testng.annotations.Test;

public class PiCalculationServiceTest {
    private final PiCalculationService service = new PiCalculationService();

    @Test
    public void should_calculate_pi() {
        //given
        //when
        double pi = service.calculatePi(10000);
        System.out.println("pi = " + pi);
        //then
    }

}