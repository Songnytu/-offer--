package jianzhioffer4;
import java.util.Stack;
/*
* 三十.包含min函数的栈
* */
public class test30 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    public test30() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    public void push(int data){
        dataStack.push(data);

        //以下代码可以整理成一句话 minStack.push(minStack.isEmpty() ? data : Math.min(minStack.peek(),data));
        if(minStack.isEmpty()){
            minStack.push(data);
        }else{
            if(minStack.peek() <= data){
                minStack.push(minStack.peek());
            }else{
                minStack.push(data);
            }
        }
    }
    public void pop(){
        dataStack.pop();
        minStack.pop();
    }
    public int min(){
        return minStack.peek();
    }
    public int top(){
        return dataStack.peek();
    }
    public static void main(String[] args){
        test30 stack = new test30();
        stack.push(3);
        System.out.println(stack.min());
        stack.push(2);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
    }
}
