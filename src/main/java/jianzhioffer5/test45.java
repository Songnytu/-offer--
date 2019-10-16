package jianzhioffer5;
/*
* 四十五.把数组排成最小数
* */
public class test45 {
    public static void main(String[] args){
        int s[]={12,53,126,52};
        System.out.println("结果:"+test(s));
    }
    public static String test(int[] s){
        //采用冒泡排序的方式进行排列组合
        int y = s.length-1;
        while(y >= 1){
            for(int i= 0;i<y;i++){
                if(Integer.parseInt(s[i]+""+s[i+1]) > Integer.parseInt(s[i+1]+""+s[i])){
                    int temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                }
            }
            y--;
        }
        String result = "";
        for(int j = 0;j<s.length;j++){
            result += s[j];
        }
        return result;
    }
}
