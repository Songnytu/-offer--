package DFS_and_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* 深度优先遍历以及广度优先遍历
*
* 自定义树结构
*                         1
*                      /   \
*                    2      3
*                  /  \   /  \
*                4    5  6   7
*
* */
public class DFS_BFS {
    public static void main(String[] args){
        //先建立一个树形结构
        TreeNode head=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        TreeNode five=new TreeNode(5);
        TreeNode six=new TreeNode(6);
        TreeNode seven=new TreeNode(7);
        head.right=three;
        head.left=second;
        second.right=five;
        second.left=four;
        three.right=seven;
        three.left=six;

        //执行广度优先遍历算法
        BroadFirstSearch(head);

        System.out.println();

        //执行深度优先遍历算法
        DepthFirstSearch(head);

    }
    //广度优先遍历算法
    public static void BroadFirstSearch(TreeNode node){
        if (node == null)
            return;
        //使用队列的数据结构
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode newNode = queue.poll();
            System.out.print(newNode.val+" ");
            if (newNode.left!=null)
                queue.add(newNode.left);
            if (newNode.right!=null)
                queue.add(newNode.right);
        }
    }

    //深度优先遍历算法
    public static void DepthFirstSearch(TreeNode node){
        if (node == null)
            return;
        //采用栈数据结构
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(node);
        while(!stack.isEmpty()){
            TreeNode newNode = stack.pop();  //弹出栈顶元素
            System.out.print(newNode.val+" ");
            if (newNode.right != null)
                stack.push(newNode.right);
            if (newNode.left != null)
                stack.push(newNode.left);
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
