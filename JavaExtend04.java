package com.baidou;
import java.util.*;
public class JavaExtend04 {
    //JavaBasic03中的getRandomArr(int num)方法进行部分修改
    public static int[] getRandomArr(int num , int digit) {
        int[] arr = new int[num + 1];       //将数组的元素设置成num + 1，因为后面还要插入一个元素，设置成num会出现java.lang.ArrayIndexOutOfBoundsException：数组越界错误
       int i = 0;
        for (;i < num;i ++)
            arr[i] = new Random().nextInt(arr.length);      //数组中前面的 num 个数随机生成，后面一个数用户输入或者随机生成，数组中一共 num +1 个数。
        arr[i] = digit;
        return arr;
    }

    //JavaBasic03中的Insertsort(int[] arr)方法进行部分修改
    //1、对数组 前面的num个 元素 进行 直接插入排序
    public static void Insertsort(int[] arr ,int length) {    //这里一定要是static
        if (length >= 2) {              //数组长度为1时，没有必要进行排序

            //不采用哨兵，数组中元素从0位置开始存放，如果采用哨兵，数组中元素从1位置开始存放，则arr[0]为哨兵
            for (int i = 1; i < length; i++) {      //从数组的第二个元素开始处理
                int x = arr[i];         //用x存放现在处理的数据，以便后面进行数据的插入操作。
                int j = i -1 ;
                for (;j >= 0 && arr[j] > x;j --)   //将待处理的元素与这一元素前面的元素进行比较，这里循环中的x不可以写成arr[i],因为此时arr[i]上的元素可能已经变化，不是原来的值
                    arr[j + 1] = arr[j];                //进行数据的移动操作
                arr[j + 1] = x;         //将处理的这个元素插入到合适的位置
            }
        }
    }

    //JavaBasic03中的print(int[] arr)方法进行部分修改
    //输出数组中的前length个元素
    public static void print(int[] arr,int length) {       //这里一定要是static
        for (int i = 0;i <length;i++)
            System.out.print(arr[i] + "   ");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //或者采用Random r = new Random();  int digit = r.nextInt(10); 效果一样的
        int digit = new Random().nextInt(10);         //要求插入的数据随机生成
        System.out.print("请输入已经排好序的int数组的元素数：");
        int num = input.nextInt();                  //表示已经排好序的int数组的元素数

        //使用数组做，手动将数组移位
        int[] arr = getRandomArr(num , digit);      //数组中的元素随机生成
        //当待排序的元素数目n较小时，采用直接插入排序或简单选择排序更好
        System.out.print("已经排好序的初始int数组是：");
        Insertsort(arr,num);
        print(arr ,num);

        //下面采用 直接插入排序 的思想
        //也可以将待插入的数字，放在数组的末尾，再次将整个数组进行排序，因为此时数组基本有序，故采用直接插入排序效率较高。
        int i = arr.length - 2;
        for (;arr[i] > digit;i --)      //将待处理的元素与这一元素前面的元素进行比较
            arr[i + 1] = arr[i];                            //进行数据的移动操作
        arr[i + 1] = digit;           //将处理的这个元素插入到合适的位置

        System.out.print("将 " + digit + " 加入已经排好序的int数组后：");
        //JavaExtend04.print(arr);
        input.close();
        
        //也可以采用Arrays类中的sort()方法对数组进行排序，
    }
}
