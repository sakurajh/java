package com.baidou;

public class JavaExtend02 {
    /*
    参考：斐波那契数列

    （1）伪代码形式:
    fibonacci(n):       // n 表示求数列中第 n 个位置上的数的值
    if n == 1:          // 设置结束递归的限制条件
        return 1
    if n == 2:          // 设置结束递归的限制条件
        return 1
    return fibonacci(n-1) + fibonacci(n-2)    // F(n) = F(n-1) + F(n-2)

    （2）Java代码形式：
    public class Demo {

        public static int fibonacci(int index) {        // index 表示求数列中第 index 个位置上的数的值
            if (index == 1 || index == 2)               // 设置结束递归的限制条件
                return 1;
            return fibonacci(index - 1) + fibonacci(index - 2);      // F(index) = F(index-1) + F(index-2)
        }

        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++)               // 输出前 10 个数
                System.out.print(fibonacci(i) + " ");
        }
    }
     */

    public static int ageFunction(int people) {
        if (people == 1)
            return 10;
        return ageFunction(people - 1) + 2;
    }

    public static void main(String[] args) {
        System.out.print("第五个人 " + ageFunction(5) + " 岁");
    }
}
