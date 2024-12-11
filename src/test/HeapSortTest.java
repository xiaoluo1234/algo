package test;

import static func.DivideAndConquer.HeapSort.heapSort;
import static func.SharedFunc.printArray;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};

        System.out.println("原数组: ");
        printArray(arr);

        heapSort(arr);

        System.out.println("排序后的数组: ");
        printArray(arr);
    }
}
