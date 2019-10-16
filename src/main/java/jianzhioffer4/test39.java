package jianzhioffer4;
/*
三十九.数组中出现次数超过一半的数字
使用 cnt 来统计一个元素出现的次数，当遍历到的元素和统计元素相等时，
令 cnt++，否则令 cnt--。如果前面查找了 i 个元素，且 cnt == 0，
说明前 i 个元素没有 majority，或者有 majority，但是出现的次数少于 i / 2 ，
因为如果多于 i / 2 的话 cnt 就一定不会为 0 。此时剩下的 n - i 个元素中，
majority 的数目依然多于 (n - i) / 2，因此继续查找就能找出 majority。

个人看法: 时间复杂度为2 个 O(N),但在空间上面没有新开辟。 节省空间就有可能需要浪费一点时间，节省时间就有可能节省空间。
 * */
public class test39 {
    public int MoreNum(int[] nums){
        int majority = nums[0];
        int cnt = 1;
        for(int i =1;i<nums.length;i++){
            cnt = nums[i] == majority ? cnt+1 : cnt-1 ;
            if(cnt == 0){
                cnt = 1;
                majority = nums[i];
            }
        }
        //上面一次循环只能证明最后得到的majority可能是超过一半的数，但不一定,再循环一次做数目校验
        int cnt2 = 0;
        for(int num :nums){
            if(majority == num){
                cnt2++;
            }
        }
        return cnt2 > nums.length/2 ? majority : -1;
    }
}
