package com.daley.maven04.demo;

//import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;
import com.daley.maven04.demo.Calc;

public class TestCalc {

        @Test
        public void addTest(){
            Calc c = new Calc();
            int add = c.add(1, 2);
//        System.out.println(add);
            Assert.assertEquals(3,add);
        }
}
