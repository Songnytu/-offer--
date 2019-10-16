package jianzhioffer6;
import java.util.BitSet;
/*
 * 在一个字符串中找到第一个只出现一次的字符，并返回它的位置
 *
 * input:abacc
 *
 * output:b
 *
 * 解题思路:要循环两次才能得出结果
 * */
public class test50 {
    public static void main(String[] args){
        System.out.println(test("kabb"));
    }

    public static int test(String str){
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        for(char c : str.toCharArray()){
            if(!bs1.get(c) && !bs2.get(c)){
                bs1.set(c);         //将0 0情况变成  1  0情况
            }
            else if(bs1.get(c) && !bs2.get(c)){
                bs2.set(c);         //将遇到的1 0情况变为 1 1情况则为该字符已经不是单独的一个字符了
            }
        }
        //再次循环找出第一给0 1情况的值即为正确答案
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(bs1.get(c) && !bs2.get(c)){
                return i;
            }
        }
        return -1;
    }
}
