package org.example;

public class Average {
    public int average(int k, int[] list){
        /*
        * This function returns the average of the first k elements in
        * a given array of integers.
        * If k is greater than the size of the array, then the function
        * will return the average of the entire array.
        * */

        int average = 0;
        int n = Math.min(k, list.length);
        if( n > 0) {
            for(int i = 0 ; i < n; i++){
                average += list[i];
            }
            average = average/n;
        }
        return average;
    }
}
