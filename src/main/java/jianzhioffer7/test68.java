package jianzhioffer7;
/*
* 六十八.树中两个节点的最低公共祖先
*
* 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
* 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
*
* 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
*
* 二叉查找树中，两个节点 p, q 的公共祖先 root 满足 root.val >= p.val && root.val <= q.val。
 * */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class test68 {
    /*
    * @Param root根节点
    * @Param p,q比较节点
    * */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //1.边界值处理一下
        if (root == null)
            return null;
        //2.思路当两个树节点一个大于root,一个小于root的时候就是最小公共祖先
        if (root.val > p.val && root.val > q.val)
            lowestCommonAncestor(root.left,p,q);
        if (root.val < p.val && root.val <q.val)
            lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
