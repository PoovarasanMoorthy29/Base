package com.base.customStack;

public interface IntegerStack {

    void push(int value);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();

    String printStack();
}
