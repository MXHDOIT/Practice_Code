//寻找两个有序数组的中位数
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,num,0,nums1.length);
        System.arraycopy(nums2,0,num,nums1.length,nums2.length);

        Arrays.sort(num);

        if(num.length%2 == 1){
            return num[num.length/2];
        }else{
            return (num[num.length/2-1]+num[num.length/2])*1.0/2;
        }
    }
}