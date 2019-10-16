package jianzhioffer2;

import java.util.Scanner;

/*
 * 十.1.斐波那契数列
 * 0 1 1 2 3 5 8 13 ....
 * */
public class test10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(test2(n));
    }
    //利用数组存储每一个值，空间复杂度为n
    public static int test1(int n){
        if(n<=1){
            return n;
        }
        int[] result = new int[n+1];
        result[0] = 0;result[1] = 1;
        for(int i = 2;i<n+1;i++){
            result[i] = result[i-1] + result[i-2];
        }

        return result[n];
    }
    //将上面的算法优化成 空间复杂度为1;
    public static int test2(int n){
        if(n <= 1){
            return n;
        }
        int result = 0;
        int re1=0;int re2=1;
        for(int i =2;i<n+1;i++){
            result = re2 + re1;
            re1 = re2;
            re2 = result;
        }
        return result;
    }
}
