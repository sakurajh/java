package com.baidou;

import java.util.*;


public class Demo5 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            Arrays.sort(strings);
            for (int i = 0; i < strings.length; i++) {
                if (i != strings.length - 1) {
                    System.out.print(strings[i] + " ");
                } else {
                    System.out.println(strings[i]);
                }
            }
        }
    }
}
