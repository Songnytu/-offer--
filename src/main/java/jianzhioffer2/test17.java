package jianzhioffer2;
/*
 * 十七.打印1到最大的n位数
 * 输入n
 * 打印1---n个9
 *
 * 例子: 2
 * 1 2 3 4 5 ....98 99
 *
 * 考虑int long long  最大限制问题，数值采用char[] 来表示
 * */
public class test17 {
    public static void main(String[] args){
        test(2);
    }

    public static void test(int n){
        if(n<1){
            return;
        }
        int[] value = new int[n];
        while(TheMost(value)){
            int zhi = value.length;
            value[zhi-1]++;
            for(int i = zhi-1;i>=0;i--){
                if(value[i]<10){
                    break;
                }
                value[i]=0;
                value[i-1]++;
            }
            print(value);
        }
    }
    //打印
    public static void print(int[] value){
        int len = 0;
        while(value[len] == 0){
            len++;
        }
        for(int i = len;i<value.length;i++){
            System.out.print(value[i]);
        }
        System.out.println();
    }
    //判断数组是否为999999最大值
    public static boolean TheMost(int[] value){
        for(int i =0 ;i<value.length;i++){
            if(value[i] != 9){
                return true;
            }
        }
        return false;
    }
}
