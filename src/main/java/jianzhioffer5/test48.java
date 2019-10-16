package jianzhioffer5;

import java.util.Arrays;
/*
* 四十八.最长不含重复字符的子字符串
* */
public class test48 {
    public static void main(String[] args){
        String str = "arabcacfr";
        System.out.println("result = "+test(str));
    }
    public static int test(String str){
        int []Num = new int[26];
        Arrays.fill(Num, -1);    //将Num数组全部初始化为-1
        int MaxNum = 0;
        int NowNum = 0;
        for(int i = 0 ;i<str.length();i++){
            if(Num[str.charAt(i)-'a']==-1 || i - Num[str.charAt(i)-'a'] > NowNum){    //此处无值
                NowNum++;
            }else{
                MaxNum = Math.max(MaxNum, NowNum);  //替换前先比较一下最大值
                NowNum = i - Num[str.charAt(i)-'a'];
            }
            Num[str.charAt(i)-'a'] = i;
        }
        MaxNum = Math.max(MaxNum, NowNum);
        return MaxNum;
    }
}
