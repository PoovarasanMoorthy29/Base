package com.base.customStack;

public class getIntegerStack implements IntegerStack {
    private int top = -1;
    private int capacity;
    private final int DEFAULT_SIZE = 5;
    private int[] arr;

    public getIntegerStack() {
        this.arr=new int[DEFAULT_SIZE];

    }

    public getIntegerStack(int size) {
        this.capacity = size;
        this.arr = new int[capacity];

    }
    @Override
    public void push(int value) {
        try {
            if (isFull()) {
                System.out.println("Stack was full");
            }
            arr[++top] = value;
        } catch (Exception e) {
            System.out.println("Exception was handled");
        }
    }

    @Override
    public int pop() {
        try {
            if (isEmpty()) {
                System.out.println("Stack was Empty ");
            }
            return arr[top--];
        } catch (Exception e) {
            System.out.println("Exception was handled");
        }
        return top;
    }

    @Override
    public int peek() {
        try {
            if (isEmpty()) {
                System.out.println("Stack was empty");
            }
            return arr[top];
        } catch (Exception e) {
            System.out.println("exception was handled");
        }
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public String printStack() {
        if (isEmpty()) {
            System.out.println("[]");
        }
        else{
            for(int index=0;index<=top;index++){
                if(index==0){
                    System.out.print("[ "+arr[index]+",");
                }
                else if(index==top){
                    System.out.print(arr[index]+" ]");
                }
                else{
                    System.out.print(arr[index]+",");
                }
            }
        }

        return "";
    }
}
