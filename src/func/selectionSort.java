package func;

import static func.SharedFunc.swap;

public class selectionSort {

    // 选择排序函数
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // 假设当前索引 i 是未排序部分的最小值索引
            int minIndex = i;

            // 在未排序部分中寻找最小值
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 更新最小值索引
                }
            }

            // 如果最小值不是当前位置 i，进行交换
            if (minIndex != i) {
                swap(arr,arr[minIndex],arr[i]);
            }
        }
    }


}
