package com.maximumofthreevariables;

public class MaximumOfThreeVariables {

    public Integer findMaximumValue(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(max)>0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        return max;
    }
    public Float findMaximumValue(Float x, Float y, Float z) {
        Float max = x;
        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max = z;
        return max;
    }
    public String findMaximumValue(String x, String y, String z) {
        String max = x;
        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max = z;
        return max;
    }
}
