package jianzhioffer4;

import java.util.ArrayList;

/*
* 三十四.二叉树中和为某一值的路径
* */
public class test34 {
    TreeNode3 tree34;
    static ArrayList<ArrayList<Integer>> list;
    public test34() {
        list = new ArrayList<ArrayList<Integer>>();
    }
    public static void main(String[] args){
        TreeNode3 tree1 = new TreeNode3(10);
        TreeNode3 tree2 = new TreeNode3(5);
        TreeNode3 tree3 = new TreeNode3(12);
        TreeNode3 tree4 = new TreeNode3(4);
        TreeNode3 tree5 = new TreeNode3(7);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        ArrayList<Integer> li = new ArrayList<Integer>();
        test34 order = new test34();
        order.findRoute(tree1, 22, 0, li);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            for(int j = 0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    private void findRoute(TreeNode3 root,int target,int nowValue,ArrayList<Integer> li){
        nowValue += root.data;
        li.add(root.data);
        if(nowValue == target && root.left == null && root.right ==null){
            list.add(new ArrayList<Integer>(li));
            return;   //结束当前路径
        }
        if(root.left != null){
            findRoute(root.left, target, nowValue,new ArrayList(li));
        }
        if(root.right != null){
            findRoute(root.right, target, nowValue,new ArrayList(li));
        }

    }
}
