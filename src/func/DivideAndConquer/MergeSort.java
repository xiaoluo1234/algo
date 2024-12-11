package func.DivideAndConquer;

public class MergeSort {

    // 归并排序的主函数
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // 找到中间点
            int mid = left + (right - left) / 2;

            // 递归分解左右两部分
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // 合并两部分
            merge(arr, left, mid, right);
        }
    }

    // 合并两个有序数组
    public static void merge(int[] arr, int left, int mid, int right) {
        // 确定两个子数组的大小
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 创建临时数组
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 拷贝数据到临时数组
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // 合并临时数组到原数组
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // 复制剩余的元素（如果有）
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
