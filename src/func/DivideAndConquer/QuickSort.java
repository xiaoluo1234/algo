package func.DivideAndConquer;
import static func.SharedFunc.swap;
public class QuickSort {

    // 快速排序主函数
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 选择基准元素，分区操作
            int pivotIndex = partition(arr, low, high);

            // 递归排序左右子数组
            quickSort(arr, low, pivotIndex - 1); // 排序左子数组
            quickSort(arr, pivotIndex + 1, high); // 排序右子数组
        }
    }
    // 分区操作
    private static int partition(int[] arr, int low, int high) {
        // 选择基准元素，这里选择最后一个元素作为基准
        int pivot = arr[high];
        int i = low - 1;  // i 指向最后一个小于 pivot 的元素的位置
        // 遍历数组，分区
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // 交换 arr[i+1] 和 arr[j]
                i++;
                swap(arr, i, j);
            }
        }
        // 将基准元素放到正确的位置
        swap(arr, i + 1, high);
        return i + 1;  // 返回基准元素的索引
    }

}
