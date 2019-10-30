package jianzhioffer6;
/*
* 五十一.数组中的逆序对
*
* 题目描述:
* 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
* 输入一个数组，求出这个数组中的逆序对的总数。
* 例子:[7,5,6,4] 得结果(7,6) (7,5) (7,4) (6,4) (5,4) 共5个逆序队
*
* 解题思路:本人采用暴力求解的方式，当然缺点很明显，所花的时间长
* */
public class test51 {
    public static void main(String[] args) {
        int[] nums = {7,5,6,4};
        System.out.println(test(nums));
    }
    public static int test(int[] nums){
        int sum =0;
        for(int i= 0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i] > nums[j])
                    sum++;
            }
        }
        return sum;
    }
}
