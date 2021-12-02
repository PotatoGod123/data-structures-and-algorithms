package code.arrays;

import java.util.Arrays;

public class ThreeSumClosest {
  public static int threeSumClosest(int[] nums, int target) {
    int ans=0;
    int temp=Integer.MAX_VALUE;
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){

      int l=i+1;
      int r=nums.length-1;

      while(l<r){
        int sum = nums[i]+nums[l]+nums[r];
        int diff=Math.abs(target-sum);
        if(sum==target)return sum;
        // diff= -3  target = 1  ans = 0 -3<1 && -3>=1
        if(diff<temp){
          temp=diff;
          ans=sum;
        }
        if(sum>target){
          r--;
        }else{
          l++;

        }
      }
    }

    return ans;

  }
}
