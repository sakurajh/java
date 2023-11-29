package com.baidou;

import java.util.*;

public class Demo10 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            int sum = 0;
            for (int i = 0; i < strings.length; i++) {
                sum += Integer.parseInt(strings[i]);
            }
            System.out.println(sum);
        }
    }
}
 