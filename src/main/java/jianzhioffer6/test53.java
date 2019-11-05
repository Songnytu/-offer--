package jianzhioffer6;
/*
* 五十三.数字在排序数组中出现的次数
*
* 题目:Input:
* nums = 1,2,3,3,3,3,4,6
* k = 3
*
* Output:
* 4
*
* 解题思路:
* 通过两个二分查找查找出k 与 k+1 的第一个出现的位置 并做差得结果
* 相当于例子中获取第一个3 和获取第一个 4的位置,做差  6 - 2 = 4
* */
public class test53 {
    public static void main(String[] args){
        int[] nums = {1,2,3,3,3,3,4,6};
        System.out.println(test(nums,3));
    }
    public static int test(int[] nums,int k){   //nums为数组，k表示需要计算的目标值
        int first = selectTwoCut(nums,k);
        int last = selectTwoCut(nums,k+1);
        return (first == nums.length || nums[first] != k) ? 0 :last - first;
    }
    private static int selectTwoCut(int[] nums,int k){  //千万注意不用使用汉式英文命名方法或变量
        int l = 0,h = nums.length;
        while(l < h){
            int m = l + (h-l)/2;
            if (nums[m] >= k)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }
}
