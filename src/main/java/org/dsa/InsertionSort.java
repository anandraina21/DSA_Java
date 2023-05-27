package org.dsa;

public class InsertionSort {
    /* Insertion sort--> An element is marked in an array, up to which sorting is done. In this way, whole array is sorted.

    Example--> Consider an unsorted array {3,2,1,4}

    First pass -> 2 is marked, now sorting will be done for elements less than position of 2 in array,
     therefore output-> {2,3,1,4}

    Second pass-> 1 is marked, now sorting will be done for elements less than position of 1 in array,
    therefore output-> {1,2,3,4}

    Last pass-> 4 is marked, now sorting will be done for elements less than position of 4 in array,
    therefore output-> {1,2,3,4}

    Time complexity--> Average and Worst case: O(n^2), Best case: O(n)
     */

    static int[] sort(int[] arr) {
        int temp;
        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    if(j == 0) {
                        arr[j] = temp;
                        break;
                    }
                } else {
                    arr[j + 1]  = temp;
                    break;
                }
            }
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int output : arr) {
            System.out.print(output + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 3, 1, 0, 7, -1};
        System.out.print("Unsorted array elements: ");
        printArray(arr);
        System.out.println();
        arr = sort(arr);
        System.out.print("Sorted array elements: ");
        printArray(arr);
    }
}
