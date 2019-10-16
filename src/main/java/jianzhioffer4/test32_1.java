package jianzhioffer4;
import java.util.LinkedList;
/*
* 三十二.1.从上往下打印二叉树
* */
public class test32_1 {
    LinkedList<TreeNode3> list;
    public test32_1() {  //构造函数
        list = new LinkedList<TreeNode3>();
    }
    public void testCome(TreeNode3 tree){
        list.add(tree);
        int i = 0;
        while(!list.isEmpty()){
            if(list.get(0).left!=null){
                list.add(list.get(0).left);
            }
            if(list.get(0).right!=null){
                list.add(list.get(0).right);
            }
            System.out.print(list.poll().data);
        }
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
        test32_1 te = new test32_1();
        te.testCome(tree1);

    }
}
class TreeNode3{
    int data;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
