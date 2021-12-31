// DSA LAB TERMINAL
// Muhammad Muaaz Shoaib
// FA20-BCS-074

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size size of array:");

        // ---------- Cannot resolve symbol 'size' Missing data type int -------- //
        int size = 0;
        size = s.nextInt();
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter values of array:");
            int inp = s.nextInt();

            // ------------- Required type: int but Provided: Scanner , s is scanner class
            // object we have to write (inp)

            arr[i] = inp;
            // Unused increment i++
            // ---------- i++;
        }
        System.out.println("###Orignal/Un-sorted array###");
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println("");
        System.out.println("------");
        Main ob = new Main();

        // --------- bubbleSort() will have to returned a sorted array but its return
        // type was void
        arr = ob.bubbleSort(arr);
        System.out.println("###sorted array###");
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println("");
        System.out.println("------");

        System.out.println("Enter Value to search in Linear way:");
        int searchLinear = s.nextInt();
        // ci = 4 is a counter it should start from zero
        int cl = 0;
        int a = 0;
        // Brackets of for loop were missing
        for (int i = 0; i < size; i++) {
            cl++;
            if (searchLinear == arr[i]) {

                System.out.println("Data Found");
                a = 1;
                break;
            }

        }
        // if (a == 0) { should be in main method
        if (a == 0) {
            System.out.println("Not Found");
        }
        System.out.println("Number of Linear comparison = " + cl);

        System.out.println("---------------------");

        // Binary
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int found = 0;
        int c2 = 0;
        // ---------- Variable 'k' is never used
        // int k = 0;
        System.out.println("Enter Value value to search in Binary search way:");
        int search = s.nextInt();
        // for (int i = 0; i < arr.length; i++, c2++) {
        for (int i = 0; i < arr.length; i++) {
            mid = (end + start) / 2;
            if (search == arr[mid]) {

                System.out.println("data found");

                // -----------Logical Error: c2++ should increment first before displaying its
                // output;
                c2++;
                System.out.println("Number of Binary comparisons = " + c2);
                found = 1;

                // c2++;
                return;

            } else if (search > arr[mid]) {
                start = mid + 1;
                System.out.println("moving towards right sub-array");
                c2 = c2 + 1;
            } else if (search < arr[mid]) {

                end = mid - 1;
                System.out.println("moving towards left sub-array");
                c2 = c2 + 1;
            }
            // c2++;
        }
        if (found == 0) {
            System.out.println("Data Not Found");
            // System.out.println("Number of Binary comparisons = " + c2);
        }
        // System.out.println("Number of Binary comparisons = " + c2);

    }

    // ---------- bubbleSort() method is outside the class

    // --------- bubbleSort() will have to returned a sorted array but its return
    // type was void
    int[] bubbleSort(int arr[]) {
        int n = arr.length - 1;
        // --------- Bracket Missing

        // ----------- Logical Error for (int i = 0; i < n - 2; i++) --- n - 2 ---> n
        for (int i = 0; i < n; i++) {
            // --------- Bracket Missing

            // --------- Logical Error for (int j = 0; j < n - i - 1; j++) ---> n - i
            for (int j = 0; j < n - i; j++) {
                // --------- Bracket Missing
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    // --------- Logical Error f arr[j] = arr[j + 2]; --> arr[j] = arr[j + 1]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}