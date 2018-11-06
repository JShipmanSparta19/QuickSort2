package com.sparta.jas;

public class QuickSorter {

    private int[] array;

    public int[] sortArray(int[] arrayToSort){
        if(arrayToSort == null || arrayToSort.length == 0){
            return new int[0];
        }
        this.array = arrayToSort.clone();
        quickSort(0, arrayToSort.length-1);
        return array;
    }

    private void quickSort(int endLeft, int endRight){
        int leftIndex = endLeft;
        int rightIndex = endRight;
        int pivot = array[(endLeft+endRight)/2];

        while(leftIndex <= rightIndex){
            while(array[leftIndex] < pivot){
                leftIndex++;
            }
            while(array[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap(leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        if(endLeft < rightIndex){
            quickSort(endLeft, rightIndex);
        }
        if(leftIndex < endRight){
          quickSort(leftIndex, endRight);
        }
    }

    private void swap(int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
