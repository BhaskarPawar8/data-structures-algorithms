package src.Arrays;

import java.util.Arrays;

/*
You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
 */
public class MissingInArray {
    int missingNumber(int arr[]) {
        // code here

        Arrays.sort(arr);
        int num = 0;
        for(int i=0; i < arr.length; i++){
            num = i + 1;
            if(arr[i] != num){
                return num;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        MissingInArray missingInArray = new MissingInArray();
        int arr[] = {1, 2, 3, 5};
        System.out.println(missingInArray.missingNumber(arr));
    }
}
