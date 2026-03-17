package com.flowerBase.math;

public class ArithmeticOperation {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int multiply(int num1,int num2){
        return num1*num2;
    }
    public int divide(int num1,int num2){
        return num1/num2;
    }
    public int modulo(int num1,int num2){
        return num1%num2;
    }
    public int findMax(int num1,int num2){
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
    public int findMin(int num1,int num2){
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public int getArrayMaxNum(int [] arr){
        int max=arr[0];
        for(int index=1;index<arr.length;index++){
            max=findMax(max,arr[index]);
        }
        return max;
    }
    public boolean isPrime(int num){
        int count=0;
        for(int index=1;index<=num;index++){
            if(num%index==0){
                count++;
            }
        }
        return count <= 2;
    }
    public int sqrt(int num){
        for(int i=1;i<=num/2;i++){
            if(i*i == num){
                return i;
            }
        }
        return -1;
    }
    public boolean isEven(int num){
        return num%2==0;
    }
    public boolean isOdd(int num){
        return num%2!=0;
    }
    public int factorial(int num){
        int fact=1;
        for(int index=1;index<=num;index++){
            fact*=index;
        }
        return fact;
    }
    public int abs(int num){
        if(num<0){
            return num*(-1);
        }
        else {
            return num;
        }
    }
    public int fibonacci(int num){
        if (num <= 1) return num;
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= num; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }



}
