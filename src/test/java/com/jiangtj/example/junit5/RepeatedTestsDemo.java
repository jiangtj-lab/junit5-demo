package com.jiangtj.example.junit5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

@Slf4j
class RepeatedTestsDemo {
    @RepeatedTest(2)
    void repeatedTest() {
        log.info("done!");
    }
    @RepeatedTest(2)
    void repeatedTest2(RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        log.info(String.format("About to execute repetition %d of %d", //
                currentRepetition, totalRepetitions));
    }
}