package com.baidou;

import java.io.FileReader;
import java.io.IOException;

public class Demo15 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("path/to/file.txt");
            // 执行读取文件的操作
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}

//public class UncheckedExceptionExample {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        try {
//            System.out.println(numbers[3]); // 数组越界
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("Array index out of bounds: " + e.getMessage());
//        }
//    }
//}