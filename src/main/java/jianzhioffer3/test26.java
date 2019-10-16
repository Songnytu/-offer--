package jianzhioffer3;
/*
* 二十六.树的子结构
* */
public class test26 {
    public static void main(String[] args){

    }
    public static boolean HasSubtree(treeNode1 root1,treeNode1 root2){
        if(root1 == null || root2 ==null){
            return false;
        }
        return isSubtreeWithRoot(root1, root2) || HasSubtree(root1.left,root2)|| HasSubtree(root1.right, root2);
    }
    private static boolean isSubtreeWithRoot(treeNode1 root1,treeNode1 root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }
        return isSubtreeWithRoot(root1.left, root2.left) && isSubtreeWithRoot(root1.right, root2.right);
    }
}
class treeNode1{
    int data;
    treeNode1 left;
    treeNode1 right;
    treeNode1(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
