package org.dsa;

public class BubbleSort {
    // Bubble sort -> Performed by sorting two consecutive elements of array at a time in each iteration until all
    // elements are sorted. Example:- In array {3, 1, 2}, 3 and 1 will be sorted first, giving {1, 3, 2}. Then 3 and 2
    // will be sorted, giving {1, 2, 3}.
    // Time complexity--> Worst case and average case: O(n^2) , Best case: O(n)

    int[] sort(int[] arr) {
        int temp;
        int counter = 0;
        for(int i = 0; i < arr.length - 1; i++) {
           for(int j = 0; j < arr.length - 1; j++) {
               // Swap happens here
               if(arr[j] > arr[j + 1]) {
                   counter = 1;
                   temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
               }
           }
           if(counter == 0) {
               return arr;
           }
        }
        return arr;
    }

    void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Unsorted array: ");
        bubbleSort.printArray(arr);
        arr = bubbleSort.sort(arr);
        System.out.println();
        System.out.print("Sorted array: ");
        bubbleSort.printArray(arr);
    }
}
