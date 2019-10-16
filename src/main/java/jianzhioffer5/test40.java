package jianzhioffer5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/*
* 四十.最小的k个数
* */
public class test40 {
    //方法自己:sort输出前k位(这里不推荐直接使用sort)
    public void test(int[] nums,int k){
        Arrays.sort(nums);
        for(int i = 0;i < k;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] nums = {1,8,9,5,6,3,2,4,7};
        int k = 5;
        test40 tr = new test40();
        tr.test(nums, k);
    }


    //方法一: 看不懂
    public ArrayList<Integer> GetLeastNumbers_Solution1(int[] nums, int k) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (k > nums.length || k <= 0)
            return ret;
        findKthSmallest(nums, k - 1);
        /* findKthSmallest 会改变数组，使得前 k 个数都是最小的 k 个数 */
        for (int i = 0; i < k; i++)
            ret.add(nums[i]);
        return ret;
    }

    public void findKthSmallest(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k)
                break;
            if (j > k)
                h = j - 1;
            else
                l = j + 1;
        }
    }

    private int partition(int[] nums, int l, int h) {
        int p = nums[l];     /* 切分元素 */
        int i = l, j = h + 1;
        while (true) {
            while (i != h && nums[++i] < p) ;
            while (j != l && nums[--j] > p) ;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    //方法二: 小顶堆算法(PriotityQueue看不懂)  时间复杂度O(NlogK)+O(K)
//    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] nums, int k) {
//        if (k > nums.length || k <= 0)
//            return new ArrayList<Integer>();
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
//        for (int num : nums) {
//            maxHeap.add(num);
//            if (maxHeap.size() > k)
//                maxHeap.poll();
//        }
//        return new ArrayList<Integer>(maxHeap);
//    }
}
