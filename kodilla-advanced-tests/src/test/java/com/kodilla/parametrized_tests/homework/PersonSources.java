package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideDataForBMICheckUp (){
        return Stream.of(
                Arguments.of(2.0,105,"Overweight"),
                Arguments.of(1.85,95,"Overweight"),
                Arguments.of(1.62,50,"Normal (healthy weight)"),
                Arguments.of(1.75,75,"Normal (healthy weight)"),
                Arguments.of(1.90,150,"Obese Class III (Very severely obese)"),
                Arguments.of(1.98,160,"Obese Class III (Very severely obese)"),
                Arguments.of(1.84,76,"Normal (healthy weight)")
        );


    }
}
