package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] data = {20, 12, 10, 25, 2};
    SelectionSort selectionSort = new SelectionSort();
    selectionSort.selectionSort(data);
//        System.out.println("Sorted Array in Ascending Order: ");
//        int[] A = selectionSort.selectionSort(data);
        for(int i = 0; i < selectionSort.selectionSort(data).length - 1; i++){
            System.out.println(selectionSort.selectionSort(data)[i]);
        }
    }
}
