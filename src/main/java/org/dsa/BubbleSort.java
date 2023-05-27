package org.dsa;

public class BubbleSort {
    /* Bubble sort -> Performed by sorting two consecutive elements of array at a time in each iteration(passes) until all
     elements are sorted.

     Example:- Given unsorted array {3, 1, 2, 0}

     First pass: 3 and 1 will be sorted first, giving {1, 3, 2, 0}. Then 3 and 2 will be sorted, giving {1, 2, 3, 0}.
     Then 3 and 0 will be sorted, giving {1, 2, 0, 3}. First pass will now end.

     Second pass: 1 and 2 will be sorted first, giving {1,2,0,3}, Then 2 and 0 will be sorted, giving {1,0,2,3}.
     Then 2 and 3 will be sorted, giving {1,0,2,3}. Second pass will now end.

     Third pass: 1 and 0 will be sorted, giving {0,1,2,3}. Similarly as previously mentioned, sorting will be done on
     consecutive elements, giving array {0,1,2,3}.

     Last pass: In this pass, array will be iterated fully, only to find out it is sorted, sorting will now end.

     Time complexity--> Worst case and average case: O(n^2) , Best case: O(n)
    */

    int[] sort(int[] arr) {
        int temp;
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // Swap happens here
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (!isSwapped) {
                return arr;
            }
        }
        return arr;
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 3, 9, 4, 5, 6, 7};
        System.out.print("Unsorted array: ");
        bubbleSort.printArray(arr);
        arr = bubbleSort.sort(arr);
        System.out.println();
        System.out.print("Sorted array: ");
        bubbleSort.printArray(arr);
    }
}
