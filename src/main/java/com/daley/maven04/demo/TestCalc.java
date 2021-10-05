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
        
        @Test
        public void subTest(){
            Calc c = new Calc();
            int sub = c.subtract(2, 1);
//            System.out.println(sub);
            Assert.assertEquals(1,sub);
        }
}
