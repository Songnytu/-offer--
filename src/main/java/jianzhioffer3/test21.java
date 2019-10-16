package jianzhioffer3;

/*
* 二十一.奇偶分离
* */
public class test21 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        reOrderArray(nums);
    }
    public static void reOrderArray(int[] nums){
        int x = 0,y = nums.length-1;
        while(x<y){
            if(nums[x]%2==0 && nums[y]%2==1){
                nums = swap(x,y,nums);
            }
            if(nums[x]%2==1){
                x++;
            }
            if(nums[y]%2==0){
                y--;
            }

        }
        for(int i = 0 ;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] swap(int j,int k,int[] nums){
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
        return nums;
    }
}
