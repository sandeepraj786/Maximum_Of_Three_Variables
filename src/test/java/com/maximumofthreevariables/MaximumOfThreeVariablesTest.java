package com.maximumofthreevariables;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeVariablesTest {
    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnFirstPositionValue(){
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1,2,3);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Integer) 3,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(123,150,144);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        System.out.println(maximumValue);
        Assert.assertEquals((Object) 150,maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(123, 150, 200);
        Integer maximumValue = (Integer) maximumOfThreeVariables.testMaximum();
        System.out.println(maximumValue);
        Assert.assertEquals((Object) 200,maximumValue);

    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(3.3f, 2.2f, 1.1f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }

    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1.1f, 3.3f, 2.2f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }
    @Test
    public void givenThreeFloatValues_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables(1.1f, 2.2f, 3.3f);
        Float maximumValue = (Float) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) 3.3f,maximumValue);
    }
    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnThirdPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("apple","banana","peach");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        System.out.println(maximumValue);
        Assert.assertEquals((Object) "peach",maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnSecondPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("apple","peach", "banana");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "peach",maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("peach", "apple", "banana");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "peach",maximumValue);
    }
    @Test
    public void givenMoreThanThreeStrings_WhenMaximumFound_ShouldReturnFirstPositionValue() {
        MaximumOfThreeVariables maximumOfThreeVariables = new MaximumOfThreeVariables("peach", "apple","banana", "mango","papaya");
        String maximumValue = (String) maximumOfThreeVariables.testMaximum();
        Assert.assertEquals((Object) "peach",maximumValue);
    }
}
