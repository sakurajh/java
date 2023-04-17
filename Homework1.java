import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework1 {
    //辗转相除法求最大公约数
    public static void main(String[] args) {
        int a = 24;
        int b = 18;
        int c = a % b;//6
        while (c != 0) {
            a = b;//18
            b = c;//6
            c = a % b;//0
        }
        System.out.println(b);
    }

    public static void main13(String[] args) {
        int n = 9;
        int i = 2;
        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        if (i > Math.sqrt(n)) {
            System.out.println("是素数");
        }

    }

    public static void main12(String[] args) {
        int n = 7;
        int i = 2;
        for (; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        if (i >= n / 2) {
            System.out.println("是素数");
        }

    }

    //判断是否为素数
    public static void main11(String[] args) {
        int n = 9;
        int i = 2;
        for (; i < n; i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        if (i == n) {
            System.out.println("是素数");
        }

    }

    //获得一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
    public static void main10(String[] args) {
        int n = 7;
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }//偶数
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }
    }

    //输入密码
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            System.out.println("请输入你的密码，共有" + count + "次机会");
            String pass = scanner.nextLine();
            if (pass.equals("123")) {//不能直接用==号比较，要用equals
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误");
            }
            count--;
        }
    }

    //输出123的各个位
    public static void main8(String[] args) {
        int n = 123;
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    //乘法口诀表
    public static void main7(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + '=' + i * j + " ");
            }
            System.out.println();
        }
    }

    //输出一个x图形
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入n的数字:");
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == j) || (i + j == n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    //六位自幂数
    public static void main5(String[] args) {
        for (int i = 1; i <= 999999; i++) {
            int count = 0;
            int tmp = i;
            int sum = 0;
            while (tmp != 0) {
                tmp /= 10;
                count++;//里面存储了当前数字的位数
            }
            tmp = i;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);//看源码ctr+鼠标左键
                tmp /= 10;
            }
            //sum存储卡和
            if (sum == i) {
                System.out.println(i);
            }

        }
    }

    public static void main4(String[] args) {
        double sum = 0.0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0 / i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        int n = -1;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main2(String[] args) {
        int n = 15;
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >>> 1;//无符号右移
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        int n = 7;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) != 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
