package jianzhioffer1;
/*
 * 三.数组中重复的数字;
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * */
public class test3 {

    public static void main(String[] args) {
        int[] A = {2,3,1,0,2,5};
        System.out.println("开始");
        System.out.println(test(A));
    }
    public static int test(int[] A){
        int top = 0;
        int j = 0;
        while(top < A.length){
            System.out.println();
            System.out.println("top:"+top);
            if(top == A[top]){
                top++;
                continue;
            }else if(A[top]<top){
                return A[top];
            }else{
                if(A[A[top]]==A[top]){
                    return A[top];
                }
                for(int i = 0;i<A.length;i++){
                    System.out.print(A[i]+" ");
                }
                int a = top,b = A[top];
                int temp = A[a];
                A[a] = A[b];
                A[b] = temp;
            }

        }
        return -1;
    }

}