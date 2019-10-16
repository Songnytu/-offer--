package jianzhioffer4;

import java.util.ArrayList;
import java.util.Arrays;

/*
* 三十八.字符串的排列
* */
public class test38 {
    ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();

    public void test(String str){
        char[] CharStrs = str.toCharArray();
        Arrays.sort(CharStrs);
        ArrayList<Character> listChar = new ArrayList<Character>();
        for(int i =0;i<CharStrs.length;i++){
            listChar.add(CharStrs[i]);
        }
        StringBuilder stringBuild = new StringBuilder();
        MainTest(listChar, stringBuild);
    }
    private void MainTest(ArrayList<Character> CharStrs,StringBuilder stringBuild){
        if(CharStrs.size() == 0){
            list.add(stringBuild);
            return;
        }
        for(int i = 0;i < CharStrs.size();i++){
            //去重复
            if(i>0 && CharStrs.get(i).equals(CharStrs.get(i-1))){
                continue;
            }
            //复制一份
            ArrayList<Character> CharStrsTemp = new ArrayList<Character>(CharStrs);
            //移除元素
            CharStrsTemp.remove(i);
            MainTest(CharStrsTemp, new StringBuilder(stringBuild).append(CharStrs.get(i)));
        }
    }
    public static void main(String[] args){
        test38 tr = new test38();
        String str = "abc";
        tr.test(str);
        for(int i = 0;i < tr.list.size();i++){
            System.out.println(tr.list.get(i).toString());
        }
    }
}
