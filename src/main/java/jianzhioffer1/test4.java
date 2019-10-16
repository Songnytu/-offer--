package jianzhioffer1;
/*
 * 四.二维数组中的查找;
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 * */
public class test4{

    public static void main(String[] args) {
        int[][] A={{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(test(A,30));
    }
    public static boolean test(int[][] A,int a){
        int M = 0;                //M是行数
        int N = A[0].length-1;    //N是列数    初始位置
        while(M < A.length && N >= 0){
            if(A[M][N] == a){
                return true;
            }else if(A[M][N] > a){
                N--;
            }else if(A[M][N] < a){
                M++;
            }
        }
        return false;
    }
}