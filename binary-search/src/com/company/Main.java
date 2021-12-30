package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int x = 9;
        int result = binarySearch.binarySearch(array, x, 0, n - 1);
        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}


