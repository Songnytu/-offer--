package jianzhioffer2;

import java.util.Arrays;

/*
 * 十.4.变态跳台阶
 * 一只可怜的瓜瓜蛙要跳n个台阶，它拥有可以一次跳跳1-n次的超能力
 * 问? 跳到n台阶，有多少种跳法
 *
 * 思路:
 * 动态规划
 * 不管跳到哪一阶层，瓜瓜蛙都有一种跳法是一口气跳n层直接到终点，剩下的可以划分为子问题，如果以及跳到k层，那么此时有多少
 * 种方法可以跳到n，即子问题跳到n-k层有多少中跳法。
 *
 * */
public class test10_4 {
    public static void main(String[] args){
        System.out.println(test(10));
        System.out.println(JumpFloorII(10));
    }
    public static int test(int n){
        int[] result = new int[n];
        Arrays.fill(result, 1);    //将数组result全部用1填充 ,一口气跳n阶
        for(int i = 0;i<n;i++){
            for(int j = 0;j < i;j++){
                result[i] += result[j];
            }
        }

        return result[n-1];
    }
    //通过规律可以发现，1 2 4 8 16 32 64 所以  return 2 ^ (n-1)
    public static int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }
}
