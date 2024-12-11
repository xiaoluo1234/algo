package func.DivideAndConquer;

import static func.SharedFunc.swap;

public class HeapSort {

    // 主函数：堆排序
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 构建最大堆，最后一个非叶子节点的下标是   (数组长度/2)−1 （基于 0 索引）
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 依次将堆顶元素与最后一个元素交换，然后重新调整堆
        for (int i = n - 1; i > 0; i--) {
            // 将堆顶元素（最大值）移动到数组末尾
            swap(arr, 0, i);

            // 调整剩余元素为最大堆
            heapify(arr, i, 0);
        }
    }

    // 调整堆，使以 i 为根的子树成为最大堆
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // 初始化最大值为根节点
        int left = 2 * i + 1; // 左子节点索引
        int right = 2 * i + 2; // 右子节点索引

        // 如果左子节点比根节点大
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 如果右子节点比根节点大
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 如果最大值不是根节点，交换并递归调整
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
}