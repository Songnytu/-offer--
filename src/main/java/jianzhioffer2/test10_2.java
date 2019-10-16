package jianzhioffer2;
/*
 *
 * 十.2.矩阵覆盖
 * 矩形覆盖 = 青蛙跳台阶             类似斐波那契数列
 *
 * 我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？
 * */
public class test10_2 {
    public static void main(String[] args){
        System.out.println(test(5));
    }
    public static int test(int n){
        if(n <= 2){
            return n;
        }
        int result = 0;
        int pre1 = 1;int pre2 = 2;
        for(int i = 3;i<=n;i++){
            result = pre2 + pre1;
            pre1 = pre2;
            pre2 = result;
        }
        return result;
    }
}
