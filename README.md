# HW3-Testing
## The Average function
The class will do the following:


     public class Average {
       public int average(int k, int[] list){

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
    

## Description of the function:
The function above will find the average of the first `k` elements in an array of integers `list`, first by taking the minimum value of length of `list` and `k` in to avariable `n`. Then, if `n` is greater then zero, the function uses a for loop to add up the first `n` values to the variable `average`, then dividing `average` by `n` afterwards. The function is written taking these cases into account: 
- If k is greater than the size of the array, the funtion will calculate the avarage of the entire array.
- If k is less than 0, the function will return 0

## Test Cases:

### Functional Test Cases::




### Partitional Test Cases:




### Boundary Test Cases:
    
