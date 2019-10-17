package jianzhioffer7;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
*
* 六十.n个骰子的点数
*
* 使用一个二维数组 dp 存储点数出现的次数，其中 dp[i][j] 表示前 i 个骰子产生点数 j 的次数。
* */
public class test60 {
    public static void main(String[] args){
        List<Map.Entry<Integer,Double>> result = test(5);
        for (Map.Entry<Integer,Double> re : result){
            System.out.println("点数为:"+re.getKey() + "概率为:"+re.getValue()+" ");
        }
    }
    public static List<Map.Entry<Integer,Double>> test(int n){
        //骰子只有6个点数
        final int face = 6;
        //骰子出现总的情况数
        final int pointNum = face * n;
        //横坐标为x个骰子，纵坐标y表示骰子的和,[x][y]表示x个骰子的点数为y的情况次数。
        long[][] dp = new long[n+1][pointNum+1];
        //初始化默认为0，下面代码进行初始化1个骰子的的时候点数在6之内的次数都为1
        for (int i=1;i<=face;i++)
            dp[1][i] = 1;
        //算法实现
        for (int i =2;i<=n;i++){
            for (int j  = i;j<=pointNum;j++){
                for (int k = 1;k<=face && k<=j;k++) {
                    dp[i][j] +=dp[i-1][j-k];
                }
            }
        }
        //输出看看结果，可以发现规律,每一位数都是由向上一格的前6位和组成
        for (int i =1;i<dp.length;i++){
            for (int j = 1;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        //n个骰子全部情况一共有6的n次方个
        final  double totalNum = Math.pow(6,n);
        List<Map.Entry<Integer,Double>> result = new ArrayList<Map.Entry<Integer, Double>>();
        for (int i = n; i <= pointNum; i++)
            result.add(new AbstractMap.SimpleEntry<Integer,Double>(i, dp[n][i] / totalNum));
        return result;
    }
}
