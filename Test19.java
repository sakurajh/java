package com.baidou;

public class Test19 {

    public static void main(String[] args){
        String str[] = {"123", "123abc", "435ssA", "abcxyz", "aa", "a"};
        for(String elemStr : str){
            try{
                int iNumber = Integer.parseInt(elemStr, 10);
                System.out.println("ok."+iNumber);
            }catch(Exception e){
                System.out.println("can not cast to int type.");
            }
        }
    }
}
