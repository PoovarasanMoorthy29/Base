package com.base.customStack;

public class StackDemo extends getIntegerStack{
    public static void main(String[] args) {
        getIntegerStack stack = new getIntegerStack(3);
        stack.push(10);
        stack.push(20);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
        System.out.println(stack.printStack());

    }
}
