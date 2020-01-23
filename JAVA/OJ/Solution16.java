import java.lang.reflect.Array;
import java.util.Arrays;
public class Soultaion {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};

        System.out.println(new Soultaion().threeSumClosest(nums,1));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
    int count = nums[0]+nums[1]+nums[2];
    int len = nums.length;
        for(int i = 0;i < len-2;i++){
        int left = i+1;
        int right = len -1;
        while(left < right){
            int sum = nums[i]+nums[left]+nums[right];
            if(Math.abs(sum - target) < Math.abs(count - target)){
                count = sum;
            }

            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                return target;
            }
        }
    }
        return count;
}
}
