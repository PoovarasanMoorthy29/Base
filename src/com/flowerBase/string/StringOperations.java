package com.flowerBase.string;

public class StringOperations {

    public String reverse(String str){
        String result="";
        for(int index=str.length()-1;index>=0;index--){
            result=result + str.charAt(index);

        }
        return result;
    }



}
