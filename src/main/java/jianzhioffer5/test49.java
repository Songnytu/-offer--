package jianzhioffer5;
/*
 * 四十九.丑数
 * 丑数 因子为2 3 5，其中1也算是丑数，丑数排列1,2,3,4,5,6,8,9,10,12,...
 *
 * 解题思路:next2,next3,next5都是从0开始跑步,各自乘于对应的倍数,取其中最小的那位，并让其next++
 * */
public class test49 {
    public static void main(String[] args){
        int n = 10;
        System.out.println("第"+n+"个丑数 = " + test(n));
    }
    public static int test(int n){
        if(n<=6){
            return n;
        }
        int []dp = new int[n];
        dp[0] = 1;
        int next2=0,next3=0,next5=0;
        for(int i = 1;i<n;i++){
            int result2 = dp[next2]*2;
            int result3 = dp[next3]*3;
            int result5 = dp[next5]*5;
            dp[i] = Math.min(result2, Math.min(result3, result5));
            if(dp[i] == result2)
                next2++;
            if(dp[i] == result3)
                next3++;
            if(dp[i] == result5)
                next5++;
        }
        return dp[n-1];
    }
}
