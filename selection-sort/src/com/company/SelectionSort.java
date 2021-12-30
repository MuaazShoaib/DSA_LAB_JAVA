package com.company;

public class SelectionSort {
    public int[] selectionSort(int array[]){
        int size = array.length;
        for(int step = 0; step<array.length - 1; step++){
            int min_index = step;
            for(int i = step + 1; i < size; i++){
                if(array[i] < array[min_index]){
                    min_index = i;
                }
                int temp = array[step];
                array[step] = array[min_index];
                array[min_index] = temp;
            }
        }
        return array;

    }
}
