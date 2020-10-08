package jianzhioffer2;
/*
 *
 * 十一.旋转数组的最小数字
 * 查找旋转数组的最小值，采用二分法查找，使得时间复杂度为O(logN)比直接for循环O(N)要快
 * 什么叫旋转数组，就是1 2 3 4 5，变成了  4 5 1 2 3，前面若干部分整体移动到数组尾部
 *
 * 如果是要考虑旋转数组当中
 * */
public class test11 {
    public static void main(String[] args){
        int[] A  = {5,6,1,2,3,4};
        System.out.println(test(A));
    }
    public static int test(int[] A){
        if(A.length == 0 )
            return 0;
        int first = 0;int last = A.length -1;
        while(first < last){
            int mid = (first + last)/2;
            if(A[first] <= A[mid]){
                first = mid +1;
            }else{
                last = mid;
            }
        }
        //这里返回first或者是last都是一样的，一般都是循环到first = last的时候结束循环
        return A[first];
    }
}
