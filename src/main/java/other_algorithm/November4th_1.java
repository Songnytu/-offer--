package other_algorithm;
/*
* 一.升升降降找数字找数字(2020/11/5 要出发java开发工程师笔试题1)
* 给一个int数组，相邻的两个数字之间做差绝对值为1
* 例子: 2 3 2 3 4 5 6 5 6      输入  k  返回下标,对应值的下标
*
* 解题思路:
* 从下标0开始,获取的值跟目标值做差,则向后或向前对对应的差做缩影
* 例如:  k = 5 ;dp[0] = 2 ;5 - 2 = 3;dp[0+3] = 3;5 - 3 =2;
*       dp[3+2] ;dp[5] = 5;返回结果index
*
* //首先说明一下为什么只取右边而不取左边,因为做差求出的坐标一定是只有全部递增才能最快找到，
* 如果做差获取到的值不是目标值，一定还在右边(nums[即currentIndex+cha])，而左边一定不存在目标值(即nums[currentIndex-cha])
* */
public class November4th_1 {
    public static void main(String[] args){
        int[] nums = {2,3,2,3,4,5,6,5,6};
        System.out.println(computer(nums,5,0));
    }
    private static int computer(int[] nums,int k,int o){
        int currentIndex = o;
        while(currentIndex>=0 && currentIndex<nums.length){
            if (nums[currentIndex] == k){
                return currentIndex;
            }else {
                currentIndex = currentIndex + (k - nums[currentIndex]);
            }
        }
        return -1;
    }
}
