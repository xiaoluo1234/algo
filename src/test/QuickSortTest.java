package test;

import java.util.Arrays;

import static func.DivideAndConquer.QuickSort.quickSort;

public class QuickSortTest {
    // 主函数，测试
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
