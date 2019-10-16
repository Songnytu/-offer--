package jianzhioffer1;
import java.util.ArrayList;
/*
 * 六.从尾到头打印链表
 * 从尾到头反过来打印出每个结点的值。
 * 该test方法未成功
 *
 * 除了使用第一种方法，还能够使用栈和链表的头插法实现倒叙
 *
 * */
public class test6 {
    public static void main(String[] args) {
        LinkedLis ss = new test6().new LinkedLis();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        ss.add(4);
        ArrayList<Object> list = test(ss);
        System.out.println();
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
    //使用递归的方式输出:将一个问题分解成多个子问题
    public static ArrayList<Object> test(LinkedLis s){
        ArrayList<Object> li = new ArrayList<Object>();
        s.showList();
        LinkedLis news = s;
        news.cutHead();
        if(s.size != 0){
            test(news);
            li.add(s.getHead());
        }

        return li;
    }

    class LinkedLis{
        private int size;   //链表节点个数
        private Node head;
        LinkedLis(){
            size = 0 ;
            head = null;
        }
        //结构体
        private class Node{
            private Object data;
            private Node next;
            Node(Object data){
                this.data = data;
            }
        }
        //向尾部添加新节点
        public void add(Object data){
            Node newNode = new Node(data);
            Node nowNode = head;
            if(size ==0){
                head = newNode;
            }else{
                while(nowNode.next != null){   //从投节点遍历到当前最尾节点，添加新元素
                    nowNode = nowNode.next;
                }
                nowNode.next = newNode;
            }
            size++;
        }
        //删除头节点:这样才能实现多个子链表
        public void cutHead(){
            if(size == 1 ){
                this.head = null;
            }else{
                this.head = head.next;
            }
            size--;
        }

        //获取子链表的头节点
        public Node getHead(){
            return head;
        }
        public void showList(){
            Node pop = head;
            for(int i = 0;i<size;i++){
                System.out.print(pop.data+" ");
                pop = pop.next;
            }
            System.out.println();
        }
    }
}
