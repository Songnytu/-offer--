package jianzhioffer7;

import java.util.Queue;

/*
* 六十六.构建乘机数组
*
* 题目描述
* 给定一个数组 A[0, 1,..., n-1]，请构建一个数组 B[0, 1,..., n-1]，
* 其中 B 中的元素 B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
* */
public class test66 {
    public static void main(String[] args){
        int A[] = {1,2,3,4,5};
        for (int b : test(A)){
            System.out.println(b);
        }
    }
    public static int[] test(int[] A){
        int n = A.length;
        int B[] = new int[n];
        for (int i=0,product = 1;i<n;product *=A[i],i++)
            B[i] = product;
        for (int i = n-1,product = 1;i>=0;product*=A[i],i--)
            B[i] *=product;
        return B;
    }
}
