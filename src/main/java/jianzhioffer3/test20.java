package jianzhioffer3;
/*
    二十.表示字符的字符串
	[]  ： 字符集合
	()  ： 分组
	?   ： 重复 0 ~ 1 次
	+   ： 重复 1 ~ n 次
	*   ： 重复 0 ~ n 次
	.   ： 任意字符
	\\. ： 转义后的 .
	\\d ： 数字

 */
public class test20 {
    public static void main(String[] args){
        char[] str = {'-','1','E','-','1','6'};
        System.out.println(isNumeric(str));
    }
    public static boolean isNumeric(char[] str){
        if(str == null || str.length == 0){
            return false;
        }
        //正则表达式
        String pox = "[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?";
        return new String(str).matches(pox);
    }
}
