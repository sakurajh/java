package String;

import java.util.Arrays;
import java.util.Locale;

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        String str="asdadsa";
        System.out.println(str.endsWith("sa"));
        System.out.println(str.startsWith("as"));
    }
    public static void main10(String[] args) {
        String str="hello ibt world    ";
        boolean ret=str.contains("hello");
        System.out.println(ret);
//        System.out.println(str);
//        String ret=str.trim();
//        System.out.print(ret);//去除掉左右两边的空格
//        System.out.println("ppppp");
    }
    public static void main9(String[] args) {
        String str="helloworld";
        String ret=str.substring(1);
        System.out.println(ret);
        String ret1=str.substring(1,5);//截取片断[1，4)
        //字符串当中的库函数，基本上只要改变，都会返回一个全新的对象
        System.out.println(ret1);
    }
    //多次拆分
    public static void main8(String[] args) {
        String str="name=zhang&age=13";
        String[]ret=str.split("&");
        for (String x:ret) {
            String[] ss=x.split("=");
            for (String s:ss) {
                System.out.println(s);
            }
        }
    }
    public static void main7(String[] args) {
        //字符"|","*","+"都得加上转义字符，前面加上 "\\
        String str ="zhangsan&wangwu&woshi6";
        String[]ret=str.split("&|a",3);//断开，字符分割
        //                    多个分割用|隔开
        System.out.println(Arrays.toString(ret));
        String str2="127.0.0.1";
        String[]ret1=str2.split("\\.");//转义的意思
        for (String x:ret1) {
            System.out.println(x);
        }
        System.out.println("=================");
        String str3="127\\0\\0\\1";
        String[]ret3=str3.split("\\\\");//两个\\是一个\
        for (String x:ret3) {
            System.out.print(x+" ");
        }


    }
    public static void main6(String[] args) {
        String str="abcabcabcdef";
        String ret1=str.replace("a","b");
        String ret=str.replaceAll("abc","ABC");
        System.out.println(ret);
        System.out.println(ret1);
        String str3=str.replaceFirst("abc","asds");
        System.out.println(str3);
    }
    public static void main5(String[] args) {
        String str="hello";
        String ret =str.toUpperCase();//小写转大写
        System.out.println(ret);

        String str2="ABCDEF";
        String ret1=str2.toLowerCase();//大写转小写
        System.out.println(ret1);
        char[] chars = str2.toCharArray();//转数组
        System.out.println(Arrays.toString(chars));
        String ret3=String.format("%d %d %d",2012,12,12);//格式化的输出
        System.out.println(ret3);

    }
    public static void main4(String[] args) {
        String str=String.valueOf(123);
        System.out.println(str);
        String str1=String.valueOf(false);
        System.out.println(str1);
        String s4 = String.valueOf(new Student("Hanmeimei", 18));
        System.out.println(s4);

        int val1=Integer.parseInt("123");
        System.out.println(val1 + 1);

        double val2=Double.parseDouble("12.12");
        System.out.println(val2);
    }
    //                      运行时的命令行参数
    public static void main3(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            
        }
    }
    public static void main2(String[] args) {
        String str ="ababcedef";
//        for (int i = 0; i < str.length(); i++) {
//            char ch=str.charAt(i);
//            System.out.print(ch);
//        }
        System.out.println(str.indexOf('e',4));//找到第一个就结束
        System.out.println(str.indexOf("abc"));//找abc,并返回a的下标
        System.out.println(str.lastIndexOf('c'));//从后往前找
        System.out.println(str.lastIndexOf("abc"));
    }
    public static void main1(String[] args) {
        //   引用变量 字符串常量
        String str="hello world";
        String str1=new String("hello");
        //              无\0
        char [] chars={'a','c','a'};//字符数组
        String str2=new String(chars);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str.length());
        System.out.println(str==str1);//比较的是地址
        System.out.println(str.equals(str1));//比较值
        System.out.println(str.compareTo(str1));//比较长度
        System.out.println(str.equalsIgnoreCase(str1));//忽略大小写是否相同
    }
}
