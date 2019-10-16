package jianzhioffer4;
/*
* 三十六.二叉搜索树与双向链表
* */
public class test36 {

}
class CreateLinked{
    private TreeNode3 pre = null;
    private TreeNode3 head = null;

    public TreeNode3 Convert(TreeNode3 root){
        inOrder(root);
        return head;
    }
    private void inOrder(TreeNode3 node){
        if(node == null){
            return;
        }
        inOrder(node.left);   //找最最左节点
        node.left = pre;
        if(pre!=null){
            pre.right = node;
        }
        pre = node;
        if(head == null){    //把头节点记录下来，head有值后不再被赋值，一直是双向链表的头节点
            head = node;
        }
        inOrder(node.right);  //找右节点
    }
}

