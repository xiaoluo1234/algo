package test;

import static func.SharedFunc.printArray;
import static func.selectionSort.selectionSort;

public class selectionSortTest {
    public static void main(String[] args) {
        int a[] = {1,8,7,55,4,99,6,0,0,1,0};
        printArray(a);
        selectionSort(a);
        printArray(a);
    }
}
