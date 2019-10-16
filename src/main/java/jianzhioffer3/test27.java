package jianzhioffer3;
/*
 * 二叉树镜像: 二叉树左右子树互换
 * */
public class test27 {
    public static void main(String[] args){

    }
    public static void test(treeNode root){
        if(root == null){
            return;
        }
        swap(root);
        test(root.left);
        test(root.right);
    }
    private static void swap(treeNode root){
        treeNode temproot = root.left;
        root.left = root.right;
        root.right = temproot;
    }
}
class treeNode{
    int data;
    treeNode left;
    treeNode right;
    treeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

