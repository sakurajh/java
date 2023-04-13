import java.sql.SQLOutput;
import java.util.Scanner;

//        1. 修饰符：现阶段直接使用public static 固定搭配
//        2. 返回值类型：如果方法有返回值，返回值类型必须要与返回的实体类型一致，
//        如果没有返回值，必须写成
//        void
//        3. 方法名字：采用小驼峰命名
//        4. 参数列表：如果方法没有参数，()中什么都不写，
//        如果有参数，需指定参数类型，多个参数之间使用逗号隔开
//        5. 方法体：方法内部要执行的语句
//        6. 在java当中，方法必须写在类当中
//        7. 在java当中，方法不能嵌套定义
//        8. 在java当中，没有方法声明一说
//方法的重载
//1. 方法名必须相同
//2. 参数列表必须不同(参数的个数不同、参数的类型不同、类型的次序必须不同)
//3. 与返回值类型是否相同无关
public class function {
    //hanio问题
    public  static  void hanio(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hanio(n-1,pos1,pos3,pos2);
        move(pos1,pos2);
        hanio(n-1,pos2,pos1,pos3);
    }
    public  static  void move(char pos1,char pos2){
        System.out.print(pos1+" -> "+pos2+" ");
    }
    public static void main(String[] args) {
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B','C');
        System.out.println();
        hanio(3,'A','B','C');
    }
    public  static  int fib2(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib2(n-1)+fib2(n-2);
    }
    //递归效率慢
    public static void main6(String[] args) {
        System.out.println(fib2(10));
    }
    //递归
    public static void fun(int a) {
        if (a < 10) {
            System.out.println(a);
            return;
        }
        fun(a / 10);
        System.out.println(a % 10);
    }

    public static int sum(int n) {
        if(n<10){
            return n;
        }
        int tmp=n%10+sum(n/10);
        return tmp;
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fun(i);
        System.out.println(sum(i));
    }

    public static int fac1(int n) {
        if (n == 1) {
            return 1;
        }
        int tmp = n * fac1(n - 1);
        return tmp;
    }

    public static void main4(String[] args) {
        System.out.println(fac1(10));
    }

    //斐波那契数列
    public static int fib(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main3(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(40));
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    public static int facsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }

    public static int fac(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main1(String[] args) {
        int ret = facsum(5);
        System.out.println(ret);
    }
}













