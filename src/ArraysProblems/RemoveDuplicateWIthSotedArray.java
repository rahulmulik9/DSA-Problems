package ArraysProblems;
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//       Without usng extra space(extra array)_

public class RemoveDuplicateWIthSotedArray {


    public static void removeDuplicate(int[] nums){


        int index=0;

        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[index]=nums[i];
            index++;
        }

        for (int a:nums  ) {
            System.out.print(a);

        }


    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,0,1,1,1,2,2,3,3,4};

        removeDuplicate(nums);
    }

}
