package com.jimmyyouhei.stack;

public class Main {

    public static void main(String[] args) {

        // please write your test here:
        ArrayListStack test = new ArrayListStack();

        test.push(1);
        test.push(2);
        test.push(3);

        test.print();

        LinkedListStack test2 = new LinkedListStack();

        test2.push(1);
        test2.push(2);
        test2.push(3);
        
        test2.print();


    }
}
