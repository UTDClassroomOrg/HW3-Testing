package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void getNameTest(){
        Service c = new Service();
        String r = c.getName(-1);

        Assertions.assertEquals("a",r);
    }

}