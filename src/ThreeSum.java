

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(threeSum(arr));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
//        if (nums.length==0||nums.length==1)
//            return new ArrayList<>();
//        List<List<Integer>> list =new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> lis = new ArrayList<>();
//                        lis.add(nums[i]);
//                        lis.add(nums[j]);
//                        lis.add(nums[k]);
//                        Collections.sort(lis);
//                        list.add(lis);
//                    }
//                }
//            }
//        }
//        list = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(list));
//        return list;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length<3)
            return new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> re = new ArrayList<>();
                    re.add(nums[i]);
                    re.add(nums[j]);
                    re.add(nums[k]);
                    set.add(re);
                }
                if(nums[i]+nums[j]+nums[k]<0)
                    j++;
                else
                    k--;
            }
        }
        List<List<Integer>> res = new LinkedList<>();
        for(List<Integer> list : set)
            res.add(list);
        return res;

    }
}
