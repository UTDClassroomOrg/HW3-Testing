package org.example;

public class Service {
    public String getName(int num){
        Average a = new Average();
        int r = a.average(num, new int[]{1, 2, 3});
        if(num<0)
            return "a";
        return "b";
    }
}
