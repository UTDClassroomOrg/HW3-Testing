# HW3-Testing
**Note: Ignore any unnecessary files and only focus on Average.java and AverageTest.java , all other java files were made for practice.**
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

### Functional Test Cases:
The function  is made to handle the following test cases for the array X[1.....n].

|Test Case     | Array parameters| Value of k | Returned Value|
|--------------|------------|------------|------------------|
|1. Empty list | {}         | 2        |       0|
|2. Functional case| {1,2,3,4,5,6}     |  3|   2|
|3. k < 0      | {1,2,3,4}  |   -2     |       0|
|4. k > length of array | {1,2,3,4,5}  | 7 |   3|



### Partitional Test Cases:

Partitions of k:
- k < 0 : no subset of the array is calculated
- 0 <= k <= legnth of array : some subset of the array as calculated
- k > length of array : the entier array is calculated

Partitions of the array:
- list.length == 0 : empty array
- list.legnth > 0 : non-empty array

|Test Case     | Array parameters| Value of k | Returned Value|
|--------------|-----------------|------------|---------------|
|1. Empty list | {}         | 2        |       0|
|2. 0< k< list.length | {1,2,3,4,5,6}  |  3|   2|
|3. k < 0      | {1,2,3,4}  |   -2     |       0|
|4. k > length of array | {1,2,3,4,5}  | 7 |   3|
|5. k == length of array| {1,2,3}      | 3 |   2|


### Boundary Test Cases:

Bounderies of k: 
- min value 1, else the function returns 0
- max value list.length - 1, else the function returns the average of the entire array

Bounderies of list:
min size 1, else the function returns 0
    
|Test Case     | Array parameters| Value of k | Returned Value|
|--------------|------------|------------|------------------|
|1. k=0 | {1,2,3,4}         | 0        |       0|
|2. k = 1| {1,2,3,4,5,6}     |  1|   1 |
|3. k = -1      | {1,2,3,4}  |   -1    |       0|
|4. k = length of array | {1,2,3,4,5}  | 5 |   3|
|5. k = length of array-1 | {1,2,3,4,5}  | 4 |   2|
|6. k = length of array+1 | {1,2,3,4,5}  | 6 |   3|
|7. list.length = 0 |   {}   | k=1    | 0|
|8. list.length = 1 |{2}     |k=1     |2|

## Fixing the Errors Upon Test Completion:
When I run my test cases, I recived 6 errors:

-  functionalAverageTest()
-  partitionValidAverageTest()
-  partitionGreaterAverageTest()
-  boundaryLengthAverageTest()
-  boundaryLengthAverageTest()
-  boundaryValidAverageTest()

The tests above failed because the Average class' code has the for loop start at zero, but end one index before the specfied index given. 
The code looks like, `for(int i=0 ; i< n-1 ; i++) ` , but instead, the code should look like, `for(int i = 0 ; i < n ; i++)` for completion.
After fixing the error, all test cases pass.

## Test cases with coverage:
![Screenshot 2024-12-09 200513](https://github.com/user-attachments/assets/bf59b389-ea21-41f2-9829-13fcf348d127)

### Sources:
- IntelliJ Comminity Edition 2023
- Dr. Kung Chapter 20: Black Box Testing
- https://www.youtube.com/watch?v=Zi67qUHbq-c
- https://www.jetbrains.com/help/idea/code-coverage.html#read_the_coverage_data 
