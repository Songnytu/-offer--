package other_algorithm;
/*
* 二.在不开辟新的空间下将两个有序数组排序(2019/11/5要出发java开发工程师笔试题2)
* 题目要求:给定两个有序数组A,B，假设A的空间足够大,将A,B排序后的结果都放在A数组中并返回
*
* 解题思路:
* A数组的内容长度为m,B数组的长度为n，设定i,j分别为A，B数组的指针，起点为m-1和n-1;
* 再设定一个m+n-1指针为k，指向A数组,比较A[i]与B[j]大小，再将值插入到k,并k--;
*
* */
public class November4th_2 {
    public static void main(String[] args){
        int[] A = {1,2,5,7,10,0,0,0,0};   //后面的0均不表示有值
        int[] B = {3,6,8,9};
        int m = 5;int n = 4;  //m为A实际长度,n为B实际长度
        for (int num:test(A,m,B,n)){
            System.out.print(num+" ");
        }
    }
    public static int[] test(int[] A,int m,int[] B,int n){
        int i = m-1,j = n-1,k = m+n-1;
        while(k>=0){
            if (i>=0&&j>=0){          //还要处理，如果某一给数组先遍历完的情况
                if (A[i]>B[j]){
                    A[k] = A[i];
                    i--;
                }else {
                    A[k] = B[j];
                    j--;
                }
            }else if (i>=0 && j<0){   //如果B数组遍历完都在A数组上了直接返回结果
                return A;
            }else if (i<0 && j>=0){
                A[k] = B[j];
                j--;
            }
            k--;
        }
        return A;
    }

}
