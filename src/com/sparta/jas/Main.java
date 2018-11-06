package com.sparta.jas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] initialArray = {1,5,9,6,8,7,3,4,2,10};
        QuickSorter doSort = new QuickSorter();
        int[] FinalArray = doSort.sortArray(initialArray);
        System.out.println("Starting Array: " + Arrays.toString(initialArray));
        System.out.println("   Final Array: " + Arrays.toString(FinalArray));
    }
}
// int[] sortedArray =