package test;

import static func.DivideAndConquer.MaximumSubarray.findMaximumSubarray;

public class MaximumSubarrayTest {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + findMaximumSubarray(array));
        // 输出：6 (子数组为 [4, -1, 2, 1])
    }
}
