package jianzhioffer5;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * 四十六.把数字翻译成字符串
 *
 * 思路只处理 1 和 2 的情况
 * 当有1或者2的 时候就走两天路1 * 10 +下一位数字，并且target+2,同时注意如果1或者2在数组的最后一位时
 * */
public class test46 {
    static String []distionaryRun={"","a","b","c","d","e",
            "f","g","h","i","j","k","l","m","n",
            "o","p","q","r","s","t","u","v","w",
            "x","y","z"};
    static List<StringBuilder> list = new ArrayList<StringBuilder>();
    public static void main(String[] args){
        int []code = {1,2,4,2,6,1};
        StringBuilder str = new StringBuilder();
        test(str,code,0);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void test(StringBuilder str,int []code,int target){
        if(target >= code.length){
            list.add(str);
            return;
        }
        if((code[target]==1||code[target]==2) && target!=code.length-1){
            test((new StringBuilder(str)).append(distionaryRun[code[target]*10+code[target+1]]),code,target+2);
        }
        test(str.append(distionaryRun[code[target]]),code,target+1);
    }
}
