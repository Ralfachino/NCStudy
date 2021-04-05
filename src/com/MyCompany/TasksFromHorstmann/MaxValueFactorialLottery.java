package com.BestCompany;
import java.math.*;
import java.util.Arrays;

public class MaxValueFactorialLottery {
    public MaxValueFactorialLottery() {
    }

    public int maxValue(int v1, int v2, int v3) {
            if (v1 <= v2) {
                v1 = v2;
            }
            if (v1 <= v3) {
                v1 = v3;
            }
            return v1;
    }

    public int maxValueMathMax(int v1, int v2, int v3) {
      return Math.max(Math.max(v1, v2), v3);
    }

    public BigInteger factorial(long num) {
        BigInteger resultValue = new BigInteger("1");
        BigInteger secondValue = new BigInteger("1");
        BigInteger resValue = new BigInteger("1");
        for(int i = 0; i < num - 1; i++) {
            secondValue = secondValue.add(resultValue);
            resValue =  resValue.multiply(secondValue);
        }

        return resValue;
    }

    public void lottery() {
        int[] array = new int[49];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        int[] arrayRes = new int[6];

        for (int i = 0; i < 6; i++) {
            arrayRes[i] = array[(int) (Math.random() * 49)];
        }
        Arrays.sort(arrayRes);
        System.out.println(Arrays.toString(arrayRes));
    }




}
