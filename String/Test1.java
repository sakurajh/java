package String;

import java.util.Arrays;

//字符串常量池在JVM中是StringTable类，实际是一个固定大小的HashTable
// (一种高效用来进行查找的数据结构，后序给大家详细介绍)，
// 不同JDK版本下字符串常量池的位置以及默认大小是不同的：
public class Test1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("hello");
        stringBuilder.append("abcd");//拼接后还是返回，不会开辟新的空间//return this
        System.out.println(stringBuilder);

//        stringBuilder.reverse();
//        System.out.println(stringBuilder);
//        把stringBuilder对象转为string类型
//        String s=stringBuilder.toString();
//        System.out.println(s);i834]
    }
    public static void main4(String[] args) {
        String str="abcd";
        for (int i = 0; i < 100; i++) {
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(i);
            str=stringBuilder.toString();
        }
        System.out.println(str);

//        String str="abcd";
//       StringBuilder stringBuilder=new StringBuilder();
//        stringBuilder.append(str);
//        for (int i = 0; i < 100; i++) {
//            stringBuilder.append(i);
//        }
//        System.out.println(stringBuilder);

    }
    public static void main3(String[] args) {
        final int array[] = {1, 2, 3, 4, 5};
        //array=new int[]{4,5,6};
        array[0] = 10;
        System.out.println(Arrays.toString(array));

    }

    public static void main2(String[] args) {
        char[] ch = new char[]{'a', 'b', 'c'};
        String s1 = new String(ch); // s1对象并不在常量池中
        s1.intern();//调用之后，会将s1对象的引用放入到常量池中
        String s2 = "abc"; // "abc" 在常量池中存在了，s2创建时直接用常量池中"abc"的引用
        System.out.println(s1 == s2);
    }

    public static void main1(String[] args) {
        String str = "abcd";
        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = new String("abcd");
        String str4 = new String("abcd");
        System.out.println(str == str1);
        System.out.println(str == str3);
        System.out.println(str3 == str4);
    }
}
