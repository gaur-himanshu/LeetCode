

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum sum of sub array is " + maxSubArray(arr) + ".");
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
