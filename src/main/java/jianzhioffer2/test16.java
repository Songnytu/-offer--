package jianzhioffer2;
/*
 * 十六.数值的整数次方
 * 实现Math.pow() 方法
 * */
public class test16 {
    public static void main(String[] args){

    }
    public static double test(double base,int exponent){
        //判断指数是否为1
        if(exponent == 1){
            return base;
        }
        //判断指数是否为0
        if(exponent == 0){
            return 1;
        }
        boolean isNegative = false;
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double result = test(base*base,exponent/2);
        if(exponent%2==1){
            result = result * base;
        }

        return isNegative? 1/result:result;
    }
}
