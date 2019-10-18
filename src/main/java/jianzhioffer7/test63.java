package jianzhioffer7;
/*
* 六十三.股票的最大利润
*
* 题目描述:可以有一次买入和一次卖出，买入必须在前。求最大收益。
* 股票价格:7 5 3 9 4 6 8 1         卖的时候就是i的时候卖，而买，则要等i-1之前的最小值,两个做差,得利润
*                                  再比较是不是i的时候卖是最佳时机。
*
* */

public class test63 {
    public static void main(String[] args){
        int[] prices = {5,1,8,3,9,5,6,4,7,0};    //当0为最后一个的时候，虽然它小于1，但是那个时候只能卖了，不能买
        System.out.println("最大利润为:"+MaxProfit(prices));
    }
    public static int MaxProfit(int[] prices) {   //求最大利润，既i-min的差值
        int MaxProfit = 0;
        int min =  prices[0];    //股票最小的价位
        for (int i = 1;i<prices.length;i++){
            MaxProfit = Math.max(MaxProfit,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return MaxProfit;
    }
}
