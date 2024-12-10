package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    @Test
    void functionalAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(4,nums);

        Assertions.assertEquals(2,a);

    }

    @Test
    void partitionLessAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(-3,nums);

        Assertions.assertEquals(0,a);

    }
    @Test
    void partitionGreaterAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(9,nums);

        Assertions.assertEquals(4,a);

    }
    @Test
    void partitionValidAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(5,nums);

        Assertions.assertEquals(3,a);

    }



    @Test
    void boundaryZeroAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(0,nums);

        Assertions.assertEquals(0,a);

    }
    @Test
    void boundaryOneAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(1,nums);

        Assertions.assertEquals(1,a);

    }

    @Test
    void boundaryLengthAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(8,nums);

        Assertions.assertEquals(4,a);

    }
    @Test
    void boundaryValidAverageTest(){
        Average work = new Average();
        int[] nums ={1,2,3,4,5,6,7,8};
        int a = work.average(6,nums);

        Assertions.assertEquals(3,a);

    }

    @Test
    void boundaryEmptyAverageTest(){
        Average work = new Average();
        int[] nums ={};
        int a = work.average(1,nums);

        Assertions.assertEquals(0,a);

    }
}