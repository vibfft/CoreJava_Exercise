package com.vibfft;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TensDigitExerciseTest {

    @Before
    public void setUp() throws Exception {
        TensDigitExercise o = new TensDigitExercise();
        System.out.println(o.toString(o.type, o.level));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        com.vibfft.TensDigitExercise o = new TensDigitExercise();

        List<Integer> numList = new ArrayList<>();
        numList.add(-1);
        numList.add(1_000_001);
        numList.add(10);
        numList.add(0);
        numList.add(101);
        numList.add(1770);

        int[] testIntegers = new int[6];
        testIntegers[0] = -1;
        testIntegers[1] = -1;
        testIntegers[2] = 1;
        testIntegers[3] = -2;
        testIntegers[4] = 0;
        testIntegers[5] = 7;

        String[] testMessages = new String[6];
        testMessages[0] = "-1 is outside input range";
        testMessages[1] = "1_000_001 is outside input range";
        testMessages[2] = "1 is tens digit of 10";
        testMessages[3] = "0 does not have tens digit";
        testMessages[4] = "0 is tens digit of 101";
        testMessages[5] = "7 is tens digit of 1770";
        int i = 0;
        for (int num: numList) {
            Assert.assertEquals(testMessages[i], testIntegers[i], o.findTensDigit(num));
            i++;
        }
    }
}