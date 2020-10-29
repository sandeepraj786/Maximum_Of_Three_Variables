package com.maximumofthreevariables;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeVariablesTest {
    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnFirstPositionValue(){
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(15, 10, 8);
        System.out.println(maximumValue);
        Assert.assertEquals((Object) 15,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(123, 150, 11);
        System.out.println(maximumValue);
        Assert.assertEquals((Object) 150,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Integer maximumValue = maximumOfThreeVariables.findMaximumValue(123, 150, 200);
        System.out.println(maximumValue);
        Assert.assertEquals((Object) 200,maximumValue);

    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Float maximumValue = maximumOfThreeVariables.findMaximumValue(3.3f, 2.2f, 1.1f);
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Float maximumValue = maximumOfThreeVariables.findMaximumValue(1.1f, 3.3f, 2.2f);
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }
    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables();
        Float maximumValue = maximumOfThreeVariables.findMaximumValue(1.1f, 2.2f, 3.3f);
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }
}
