package com.jimmyyouhei.stack;

import java.util.ArrayList;

public class ArrayListStack {

    ArrayList<Object> arrayListStack = new ArrayList<>();

    public void push(Object toBePushed){
        arrayListStack.add(toBePushed);
    }

    public void pop(){
        arrayListStack.remove(arrayListStack.size()-1);
    }

    public Object peek(){
        return arrayListStack.get(arrayListStack.size()-1);
    }

    public void print(){
        System.out.println("Here are all the elements");
        for (int i = 0; i < arrayListStack.size() ; i++){
            System.out.println(arrayListStack.get(i));
        }
    }

}
