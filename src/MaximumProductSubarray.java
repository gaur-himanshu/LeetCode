

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("MAximum product of Subarray is: " + maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min=nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp=max;
            max = Math.max(Math.max(max * nums[i],min*nums[i]), nums[i]);
            min=Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);

            res = Math.max(max, res);
        }
        return res;
    }
}
