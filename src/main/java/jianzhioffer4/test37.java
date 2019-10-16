package jianzhioffer4;
/*
* 三十七.序列换二叉树
* */
public class test37 {
    private String[] SerializeChars;
    private int i;
    public String Serialize(TreeNode3 root){
        if(root == null){
            return "$";
        }
        return root.data+","+Serialize(root.left)+","+Serialize(root.right);
    }

    public TreeNode3 Desrialize(String deserializeStr){
        SerializeChars = deserializeStr.split(",");
        i = 0;
        return Deserialize();
    }
    private TreeNode3 Deserialize(){
        if(SerializeChars[i].equals("$")){
            i++;
            return null;
        }
        TreeNode3 root = new TreeNode3(Integer.parseInt(SerializeChars[i++]));
        root.left = Deserialize();
        root.right = Deserialize();
        return root;
    }

    public static void main(String[] args){
        TreeNode3 root1 = new TreeNode3(1);
        TreeNode3 root2 = new TreeNode3(2);
        TreeNode3 root3 = new TreeNode3(3);
        TreeNode3 root4 = new TreeNode3(4);
        TreeNode3 root5 = new TreeNode3(5);
        TreeNode3 root6 = new TreeNode3(6);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root3.left = root5;
        root3.right = root6;
        test37 tr = new test37();
        String str = tr.Serialize(root1);
        System.out.println(str);
        TreeNode3 temp = tr.Desrialize(str);
        System.out.println(temp.data);
        System.out.println(temp.left.data);
        System.out.println(temp.left.left.data);
        System.out.println(temp.right.data);
        System.out.println(temp.right.left.data);
        System.out.println(temp.right.right.data);
    }
}
