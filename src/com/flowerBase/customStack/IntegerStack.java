package com.flowerBase.customStack;

public interface IntegerStack {

    void push(int value);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();

    String printStack();
}
