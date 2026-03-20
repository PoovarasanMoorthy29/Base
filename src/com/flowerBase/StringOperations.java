package com.flowerBase;

public class StringOperations {
    public int len(String str){
        char[]ch=str.toCharArray();
        int count=0;
        for(char c:ch){
            count++;
        }
        return count;

    }
    public String reverse(String str){
        String result="";
        for(int index=str.length()-1;index>=0;index--){
            result=result + str.charAt(index);

        }
        return result;
    }




}
