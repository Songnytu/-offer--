package jianzhioffer5;
/*
 * 四十二.连续子数组的最大和
 * 题目描述:
 * 给定一个数组，求出最大连续子数组的和
 * */
public class test42 {
    public static void main(String[] args){
        int a[] = {1,-2,3,10-4,7,2,-5};
        System.out.println(test(a));
    }
    public static int test(int a[]){
        int bestSum = 0,sum =0;
        for(int i = 0;i<a.length;i++){
            sum = (sum<=0)?  a[i] :  sum + a[i];
            bestSum = (bestSum < sum) ? sum : bestSum;
        }
        return bestSum;
    }
}
