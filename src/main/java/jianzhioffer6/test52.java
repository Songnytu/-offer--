package jianzhioffer6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 五十二.两个链表的第一个公共节点
*
* 题目:输入两个链表，找出它们第一个公共节点。(两台表经过第一个公共节点后，后面的节点都是公共的，类似一个"人"字链表)
*
* 解题思路:1.由于两个链表的后面的公共部分都是一样的，采用两个栈的方式，将链表从尾部向前遍历，
* 直到两台链表遍历结果不相同为止。
*
* 2.另外一种思路,a，链表同时循环到下一节点，当a链表到达尾节点的时候，它继续重b链表头开始遍历，而
* 同时执行的b链表运行到尾节点时切换到a链表头继续遍历，两个切换后遇到的第一个公共节点就是答案。
* */
public class test52{
    public static void main(String[] args) {
        /*
        * 这两个链表大概的样子
        *       1 - 2 \
        *              3 - 4 - 5
        *   6 - 7 - 8 /
        *                           结果:公共节点为3
        * */
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode3;
        System.out.println(test(listNode1,listNode6).value);
    }
    //算法
    public static ListNode test(ListNode a,ListNode b){
        ListNode l1= a;ListNode l2 = b;
        while (l1 != l2){
            l1 = l1.next == null ? b : l1.next;
            l2 = l2.next == null ? a : l2.next;
        }
        return l1;
    }
}
class ListNode{   //单链表的模型
    int value;
    ListNode next;
    ListNode(int n){
        value = n;
    }
}
