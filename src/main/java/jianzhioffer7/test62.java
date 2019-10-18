package jianzhioffer7;
/*
* 六十二.圆圈中最后剩下的数
* 题目:
* 让小朋友们围成一个大圈。然后，随机指定一个数 m，让编号为 0 的小朋友开始报数。
* 每次喊到 m-1 的那个小朋友要出列唱首歌， 然后可以在礼品箱中任意的挑选礼物，
* 并且不再回到圈中，*重点:(从他的下一个小朋友开始)，继续 0...m-1 报数 .... 这样下去 ....
* 直到剩下最后一个小朋友，可以不用表演。
*
*
* */
public class test62 {
    public static void main(String[] args){

    }
    public static int LastRemaining_Solution(int n, int m){
        if (n == 0)     /* 特殊输入的处理 */
            return -1;
        if (n == 1)     /* 递归返回条件 */
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
        /*这个句子解释一下
        假设:一共8个小朋友
        首先 0 1 2 3 4 5 6 7  报数   n为剩余人数,m为要挑选礼物的小朋友
        如果m为4，则会变成      0 1 2   4 5 6 7
        到下次报数时就重新喊号  4 5 6   0 1 2 3   那么这次要挑礼物的是3号，那要怎么
        告诉最开始挑选礼物的是7小朋友呢？     公式 (3 + 4) % 8 = 7  而这个三就是(n-1,m)得来的
        */
    }
}
