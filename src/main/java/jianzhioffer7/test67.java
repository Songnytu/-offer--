package jianzhioffer7;

import java.util.HashMap;

/*
* 六十七.将字符串转成整形
* */

public class test67 {
    //int取值范围 -2147483648 ~ 2147483647
    //该题未做边界值判断
    public static void main(String[] args){
        String str = "-859123";
        System.out.println(test(str));
    }
    public static int test(String str) {
        char[] sch = str.toCharArray();
        boolean isNegative = sch[0] == '-';
        int result = 0;
        for (int i = 0; i < sch.length; i++) {
            if (i == 0 && (sch[0] == '+' || sch[0] == '-')) {
                continue;
            }
            if (sch[i] < '0' || sch[i] > '9') {   /*非法*/
                return 0;
            }
            result = result * 10 + (sch[i] - '0');
        }
        return isNegative ? -result : result;
    }
}
