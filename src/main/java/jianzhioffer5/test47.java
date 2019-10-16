package jianzhioffer5;
/*
 * 四十七.礼物最大价值
 * 题目:二维数组，只能向下或者向右移动使得最终移动到最右下角的时候为最大值路径
 *
 * 思路:
 * 采用动态规划
 * 二维数组,没一个空格所得到的值都是通过比较当前空格的上面空格跟左边空格哪个大再+上原数组的值
 * */
public class test47 {
    public static void main(String[] args){
        int a[][] = {{1,5,8,9,6,4,2,3},
                {5,8,9,6,3,1,4,7},
                {8,9,6,5,2,3,4,7},
                {6,3,5,4,8,7,4,5},
                {8,5,6,4,1,2,3,5}};
        System.out.println("最终结果:"+test(a));
    }
    //采用动态规划(采用非递归的方式,递归的太慢的,重复计算量过多)
    public static int test(int a[][]){
        int[] getIt = new int[a[0].length];
        int m = a.length;     //m行
        int n = a[0].length;  //n列
        for(int i=0;i<m;i++){
            getIt[0] += a[i][0];
            for(int j = 1;j<n;j++){
                getIt[j] = getIt[j] > getIt[j-1] ? getIt[j] + a[i][j] : getIt[j-1] + a[i][j];
            }
            for(int y =0 ;y<n;y++){
                System.out.print(getIt[y]+" ");
            }
            System.out.println();
        }
        return getIt[n-1];
    }
}
