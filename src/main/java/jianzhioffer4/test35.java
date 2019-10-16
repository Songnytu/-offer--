package jianzhioffer4;
/*
* 三十五.复杂链表的复制
 * */
public class test35 {
    public static void main(String[] args){

    }
    public RandomListNode Clone(RandomListNode pHead){
        //判断边界
        if(pHead == null)
            return null;
        //开始复制性的插入新节点
        RandomListNode cur = pHead;
        while(cur!=null){
            RandomListNode newNode = new RandomListNode(cur.label);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }
        //建立random链接
        cur = pHead;
        while(cur != null){
            RandomListNode clone = cur.next;
            if(cur.random != null){
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }
        //拆分
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(cur.next != null){
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return pCloneHead;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
