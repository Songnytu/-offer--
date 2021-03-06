package jianzhioffer7;
/*
* 六十五.不做加减乘除做加法
*
* 题目描述:
* 写一个函数，求两个整数之和，要求不得使用 +、-、*、/ 四则运算符号。
*
* a ^ b 表示没有考虑进位的情况下两数的和，(a & b) << 1 就是进位。
*
* 解题思路:
* 递归会终止的原因是 (a & b) << 1 最右边会多一个 0，那么继续递归，
* 进位最右边的 0 会慢慢增多，最后进位会变为0，递归终止。
* */
public class test65 {
    public static void main(String[] args){
        int a = 5;
        int b = 8;
        System.out.println(Add(a,b));
    }
    public static int Add(int a,int b){
        return b == 0 ? a: Add(a ^ b,(a & b) <<1);
        //^ 是按位取异或，&是按位取与
        /* <<：是逻辑左移，右边补0，符号位和其他位一样要移动。
            举例:数学意义：在数字没有溢出的前提下，对于正数和负数，
            左移一位都相当于乘以2的1次方，左移n位就相当于乘以2的n次方。

            计算：3 << 2
            3 << 2，则是将数字3左移2位
            1、首先把3转换为二进制数字0000 0000 0000 0000 0000 0000 0000 0011
            2、然后把该数字高位（左侧）的两个零移出，其他的数字都朝左平移2位，
            最后在低位（右侧）的两个空位补零。
            3、则得到的最终结果是0000 0000 0000 0000 0000 0000 0000 1100，则转换为十进制是12。
         */
    }
}
