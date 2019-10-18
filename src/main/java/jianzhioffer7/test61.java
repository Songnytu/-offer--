package jianzhioffer7;

import java.sql.Array;
import java.util.Arrays;

/*
* 六十一.扑克牌顺子
*
* 题目描述:
* 给你5张牌，判断能不能组成顺着,大王用0替代，大王可以替代任意数
* */
public class test61 {
    public static void main(String[] args){
        int []num = {0,9,8,6,0};
        System.out.println(test(num));
    }
    public static boolean test(int []num){
        Arrays.sort(num);   //快速排序一下
        int ok = 0;   //ok能量
        int last = 0;   //上一个数
        for (int i = 0;i<num.length;i++){
            if (num[i] == 0){
                ok++;
                continue;
            }
            //首先判段是不是第一个非0的数,或者是上一个数+1
            if (last == 0 || num[i] == last+1 ){
                last = num[i];
            }else {
                if (ok == 0){
                    return false;
                }
                ok--;
            }

        }
        return true;
    }
}
