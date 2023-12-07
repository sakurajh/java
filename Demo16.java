package com.baidou;

public class Demo16 {  
    public static void main(String[] args) {  
        try{    
            System.out.println("try 语句块开始");  
            int myArray[]=new int[5];    
            myArray [5]=10/0;    
        } 
        catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic Exception :: 除以0 !");  
        }
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("ArrayIndexOutOfBounds :: 数组越界");  
        } 
        catch(Exception e)  
        {  
            System.out.println("Exception :: " + e.getMessage ());  
        }       
        System.out.println("剩余代码");    
    }  
}  
