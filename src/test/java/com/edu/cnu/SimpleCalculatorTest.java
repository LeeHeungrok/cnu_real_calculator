package com.edu.cnu;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by leeheungrok on 2017. 4. 17..
 */
public class SimpleCalculatorTest {
    @Before
    public void setUp() {
        System.out.println("this is before");
    }

    @Test
    public void 더하기() {
        Calculator calculator = new Calculator();
        int result = calculator.dividBy(8, 0);
        assertThat(result, is(2));
    }

    @Test
    public void 곱샘(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 4);
        assertThat(result, is(8));
    }

    @Test
    public void 나누기(){
        Calculator calculator = new Calculator();
        int result = calculator.dividBy(4, 2);
        assertThat(result, is(2));
    }
    @Test
    public void 팩토리얼(){
        Calculator calculator = new Calculator();
        int result = calculator.factorial(2);
        assertThat(result, is(2));
    }

}
