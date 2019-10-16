package jianzhioffer5;
/*
 * 四十四.数字序列中的某一位数字
 * 输入n
 * 求出01234567891011121314....的第n位是哪个东西
 *
 * 解题思路:先求出是在哪个分段10 100 1000 10000 然后做差值，求目标值再求余准确是哪一位数字
 * */
public class test44 {
    public static void main(String[] args){
        System.out.println("最后答案"+test(15));
    }
    public static int test(int n){
        if(n<10){
            return n;
        }else{
            int m = 2,sum;
            for(sum = 9;(sum+9*(int)Math.pow(10, m-1)*m)<n;){
                sum += 9*(int)Math.pow(10, m-1)*m;
                m++;
            }
            System.out.println("m = "+m);
            int p = n - sum;   //n - num 就是 断层差值
            System.out.println("p = "+p);
            int yu = p%(m);
            System.out.println("yu = "+yu);
            int num = (int)p/m;
            System.out.println("num = "+num);
            int target = (int)Math.pow(10, m-1) + num;
            System.out.println("target = "+target);
            if(yu == 0){
                System.out.println("1结果");
                return (target - 1) % 10;
            }else{
                System.out.println("2结果");
                return  target / (int)Math.pow(10,m-yu) % 10;
            }
        }
    }
}
