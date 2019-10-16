package jianzhioffer5;

import java.util.Scanner;

/*
 * 四十三.整数中1到n总共有多少个1
 * 题目描述:
 * 求1-n一共有多个个1
 *
 * */
public class test43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(test(n));
    }
    public static int test(int n){
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            System.out.println("a = "+a+" b = "+b+" n ="+n+" m = "+m);
            if(a%10==1){
                cnt = cnt + (a+8)/10*m + b+1;
            }
            else{
                cnt = cnt + (a+8)/10*m;
            }
            System.out.println("cnt = "+cnt);
            //cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}
