package jianzhioffer4;
import java.util.Stack;
/*
* 三十一.栈的压入弹出序列
* */
public class test31 {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int[] B = {4,3,5,1,2};
        System.out.println(isPopOrder(A,B));
    }
    public static boolean isPopOrder(int[] A,int[] B){
        int n = A.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0,j=0;i<n;i++){
            stack.push(A[i]);
            while(j<n && !stack.isEmpty() && stack.peek() == B[j]){
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
