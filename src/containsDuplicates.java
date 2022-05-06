

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class containsDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array contains duplicate: " + containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length==1)
            return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
