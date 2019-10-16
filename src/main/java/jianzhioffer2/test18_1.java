package jianzhioffer2;
/*
* 十八.1.删除链表的节点
* */
public class test18_1 {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addList(1);
        list.addList(2);
        list.addList(3);
        list.addList(4);
        list.printList();
        list.test(list.head.next.next);
        list.printList();
    }
}
class ListNode{
    int len;
    Listcode head;
    ListNode(){
        len = 0;
        head = null;
    }
    class Listcode{
        int data;   //数据
        Listcode next;   //指向下一个节点
        Listcode(int data){
            this.data = data;
        }
    }
    public void test(Listcode li){
        if(head==null||li == null){
            return;
        }
        if(li.next!=null){  //删除的节点不是最尾的节点
            Listcode tempnext = li.next;
            li.data = tempnext.data;
            li.next = tempnext.next;
        }else{    //如果是最尾的节点,则判断是不是头节点
            if(li == head){
                head = null;
            }else{
                Listcode temphead = head;
                while(temphead.next!=li){
                    temphead = temphead.next;
                }
                temphead.next = null;
            }
        }
    }
    //StringBuffer
    //String
    //添加
    public void addList(int data){
        Listcode newCode = new Listcode(data);
        if(head == null){
            head = newCode;
            len++;
            return;
        }else{
            Listcode templi = head;
            while(templi.next != null){
                templi = templi.next;
            }
            templi.next = newCode;   //向尾部添加节点
            len++;
        }
    }
    //输出
    public void printList(){
        Listcode tempList = head;
        while(tempList!=null){
            System.out.print(tempList.data+" ");
            tempList = tempList.next;
        }
        System.out.println();
    }
}
