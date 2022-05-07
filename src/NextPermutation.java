

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr,size);
        nextPermutation(arr);
        printArray(arr,size);
    }
    public static void nextPermutation(int[] nums) {
        if (nums==null||nums.length==1)
            return;
        int i= nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if (i>=0){
            int j= nums.length-1;
            while (nums[j]<=nums[i])
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i>=j)
            return;
        swap(nums, i, j);
        reverse(nums, i+1, j-1);
    }

    private static void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private static void printArray(int[] arr,int n){
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[n-1]+".");
    }
}
