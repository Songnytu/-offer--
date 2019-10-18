package jianzhioffer7;
/*
* 六十四.求1 + 2 + 3 + ..... +n;
*
* 题目描述:
* 要求不能使用乘除法、for、while、if、else、switch、case 等关键字及条件判断语句 A ? B : C。
* 解题思路:我们使用递归
* */
public class test64 {
    public static void main(String[] args){
        int n = 5;
        System.out.println(test(n));
    }
    public static int test(int n){
        int sum = n;
        boolean b = (n > 0) && ((sum += test(n - 1)) > 0);
        return sum;
    }
}
