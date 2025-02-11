package src.Arrays;

import java.util.HashSet;
import java.util.Set;

/*
Given two arrays a[] and b[], check if they are disjoint, i.e., there is no element common between both the arrays. Return true if if they are disjoint, otherwise, false.

Examples:

Input: a[] = [2, 34, 11, 9, 3], b[] = [2, 1, 3, 5]
Output: false
Explanation: 3 is common in both the arrays.

 */
public class CheckForDisjoint {
    public boolean areDisjoint(int[] a, int[] b) {

        Set<Integer> aSet = new HashSet<Integer>();
        for(int abc:a){
            aSet.add(abc);
        }

        for(int bbc:b){
            if(aSet.contains(bbc)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CheckForDisjoint checkForDisjoint = new CheckForDisjoint();
        int a[] = {9, 3, 3, 10 ,8 ,11, 9 ,8 ,9 ,0};
        int b[] = {11, 12, 7, 7, 1 ,11 ,4 ,10, 6, 9};
        System.out.println(checkForDisjoint.areDisjoint(a,b));
    }
}
