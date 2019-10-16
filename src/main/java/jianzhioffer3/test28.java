package jianzhioffer3;
/*
* 对称的二叉树
* */
public class test28 {
    public static void main(String[] args){

    }
    public static boolean test(treeNod root){
        if(root ==null){
            return true;
        }
        return isSymmetrical(root.left, root.right);
    }
    private static boolean isSymmetrical(treeNod t1,treeNod t2){
        if(t1 == null && t2 ==null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        if(t1.data != t2.data){
            return false;
        }
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
    }
}
class treeNod{
    int data;
    treeNod left;
    treeNod right;
    treeNod(int data){
        this.data = data;
        left = null;
        right = null;
    }
}