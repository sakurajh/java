import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;

//不能做switch的参数的数据类型是那些？1.long 2.float double 3.boolean
public class circlum {
    public static void main(String[] args) {
        Random random =new Random();
        int x= random.nextInt(100)+1;
        System.out.println("随机数"+x);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个数字:");
            int n=sc.nextInt();
            if(n<x){
                System.out.println("猜小了");
            }else if(n>x){
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
    public static void main6(String[] args) {
        Random random =new Random();
        //int n = random.nextInt(100)+1;//[1--101随机数]
        int n = random.nextInt(102);
        System.out.println(n);

    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();//使用next是，读到空格就结束了
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();//此时nextline失效，因为nextint会输入一个回车
    }
    public static void main4(String[] args) {
        //fori
        for (int i = 0; i<100 ;i ++) {
            System.out.println(i);
        }
    }
    public static void main3(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("三的倍数为:"+i);
            }
            i++;
        }
    }
//        int a=10;
//        while(a>=0){
//            if(a==9){
//                continue;//死循环
//            }
//            a--;
//        }

    public static void main2(String[] args) {
        int i=1,mul=1,sum=0;
            for(i=1;i<6;i++){
                mul*=i;
                sum+=mul;
            }
        System.out.println(mul);
        System.out.println(i);
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        int i = 0, sum = 0, sum1 = 0, sum2 = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
            i++;
        }
        sum = sum1 + sum2;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        //int i=1;
//        for(i=1;i<11;i++){
//            System.out.println(i);
//        }
        //while(i<=10){//循环的判断条件一定是布尔类型
        //System.out.println(i);
        // i++;//循环的步进
        //}

    }
}
