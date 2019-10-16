package jianzhioffer2;
/*
 * 十五.求一个值的二进制有多少个1
 * */
public class test15 {
    public static void main(String[] args){
        System.out.println(test1(10));
    }
    //最简单的求解方式，调方法
    public static int test1(int n){
        return Integer.bitCount(n);
    }
    //& 用法:两个数值的二进制按位取，都为1的时候为1
    //例子: 10 = 1010    9 = 1001     10 & 9 = 1000
    public static int test2(int n){
        int ctn = 0;
        while(n != 0){
            ctn++;
            n = n&(n-1);
        }
        return ctn;
    }
}
