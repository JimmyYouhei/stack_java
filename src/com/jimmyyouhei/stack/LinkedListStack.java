package com.jimmyyouhei.stack;

import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<Object> linkedListStack = new LinkedList<>();

    public void push(Object toBePushed) {
        linkedListStack.addFirst(toBePushed);
    }

    public void pop(){
        linkedListStack.removeFirst();
    }

    public Object peek(){
        return linkedListStack.peekFirst();
    }

    public void print(){
        System.out.println("all Elements are:");

        for (int i = 0 ; i<linkedListStack.size() ; i++){
            System.out.println(linkedListStack.get(i));
        }

    }

}
