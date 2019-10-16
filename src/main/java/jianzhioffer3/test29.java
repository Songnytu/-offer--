package jianzhioffer3;

public class test29 {
    public static void main(String[] args){
        int [][] nums= {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
        };
        test(nums);
    }
    public static void test(int[][] nums){
        int up = 0,down = nums.length-1,left = 0,right = nums[0].length-1;

        while(up <= down && left <= right){
            for(int i = left;i<=right;i++){
                System.out.print(nums[up][i]+" ");
            }
            up++;
            for(int i = up;i<=down;i++){
                System.out.print(nums[i][right]+" ");
            }
            right--;
            for(int i = right;i>=left;i--){
                System.out.print(nums[down][i]+" ");
            }
            down--;
            for(int i = down;i >= up;i--){
                System.out.print(nums[i][left]+" ");
            }
            left++;
        }

    }
}
