package jianzhioffer4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*

三十二.3.按之字形顺序打印二叉树

请实现一个函数按照之字形打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，
其他行以此类推。

 * */
public class test32_3 {
    LinkedList<LinkedList<Integer>> list;
    public test32_3() {  //构造函数
        list = new LinkedList<LinkedList<Integer>>();
    }
    public LinkedList<LinkedList<Integer>> testCome(TreeNode3 tree){
        Queue<TreeNode3> queue = new LinkedList<TreeNode3>();
        queue.add(tree);
        boolean reverse = false;
        while(!queue.isEmpty()){
            LinkedList<Integer> li = new LinkedList<Integer>();
            int cnt = queue.size();
            while(cnt-- >0){
                TreeNode3 temp = queue.poll();
                if(temp == null){
                    continue;
                }
                li.add(temp.data);
                queue.add(temp.left);
                queue.add(temp.right);
            }
            if(reverse){
                Collections.reverse(li);
            }
            list.add(li);
            reverse = !reverse;
        }

        return list;
    }

    public static void main(String[] args){
        TreeNode3 tree1 = new TreeNode3(1);
        TreeNode3 tree2 = new TreeNode3(2);
        TreeNode3 tree3 = new TreeNode3(3);
        TreeNode3 tree4 = new TreeNode3(4);
        TreeNode3 tree5 = new TreeNode3(5);
        TreeNode3 tree6 = new TreeNode3(6);
        TreeNode3 tree7 = new TreeNode3(7);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;
        test32_3 te = new test32_3();
        LinkedList<LinkedList<Integer>> fg= te.testCome(tree1);
        for(int i = 0;i<fg.size();i++){
            for(int j = 0;j<fg.get(i).size();j++){
                System.out.print(fg.get(i).get(j)+" ");
            }
        }
    }
}
///TreeNode4跟这个结构一模一样
class TreeNode4{
    int data;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

