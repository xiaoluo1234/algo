package test;

import static func.DivideAndConquer.MergeSort.mergeSort;
import static func.SharedFunc.printArray;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("原数组: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("排序后的数组: ");
        printArray(arr);
    }
}
