package com.base.customScanner;

import java.util.Scanner;

public class getInput implements getScanner{
    @Override
    public Scanner getScannerObj() {
        return new Scanner(System.in);
    }

    @Override
    public byte getByte() {
        return getScannerObj().nextByte();
    }

    @Override
    public short getShort() {
        return getScannerObj().nextShort();
    }

    @Override
    public int getInt() {
        return getScannerObj().nextInt();
    }

    @Override
    public long getLong() {
        return getScannerObj().nextLong();
    }

    @Override
    public float getFloat() {
        return getScannerObj().nextFloat();
    }

    @Override
    public double getDouble() {
        return getScannerObj().nextDouble();
    }

    @Override
    public String getChar() {
        return getScannerObj().next();
    }

    @Override
    public String getString() {
        return getScannerObj().nextLine();
    }
    public void getIntArray(int size){
        int[] result=new int[size];
        int no=1;
        for(int index=0;index<size;index++){
            System.out.println("Enter the "+no+" value:");
            result[index]=getInt();
            no++;
        }
        printArray(result);
    }
    public void printArray(int[] arr){
        for(int index=0;index<arr.length;index++){
           if(index==0){
               System.out.println("["+arr[index]+",");
           }
           else if(index==arr.length-1){
               System.out.println(arr[index]+"]");
           }
           else{
               System.out.println(arr[index]+",");
           }
        }

    }
}
