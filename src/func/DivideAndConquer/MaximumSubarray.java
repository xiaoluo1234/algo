package func.DivideAndConquer;
public class MaximumSubarray {

    // 求跨中间点的最大子数组和
    private static int MaximumSubarray(int[] arr, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        // 向左扫描，找左侧最大和
        for (int i = mid; i >= low; i--) {
            sum += arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        // 向右扫描，找右侧最大和
        for (int i = mid + 1; i <= high; i++) {
            sum += arr[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        // 跨中间点的最大和
        return leftSum + rightSum;
    }

    // 分治法求最大子数组和
    private static int maxSubarray(int[] arr, int low, int high) {
        // 基础情况：只有一个元素
        if (low == high) {
            return arr[low];
        }

        // 计算中间点
        int mid = (low + high) / 2;

        // 递归求左侧、右侧和跨中间点的最大子数组和
        int leftSum = maxSubarray(arr, low, mid);
        int rightSum = maxSubarray(arr, mid + 1, high);
        int crossSum = MaximumSubarray(arr, low, mid, high);

        // 返回三者中的最大值
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    // 主函数
    public static int findMaximumSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        return maxSubarray(arr, 0, arr.length - 1);
    }

}
