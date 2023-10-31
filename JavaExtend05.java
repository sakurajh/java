package com.baidou;
import java.util.*;

public class JavaExtend05 {
    //交换函数，与JavaBasic22中四、利用数组完全一样。
    //定义为静态方法
    //如果不定义为静态方法，则在主函数中需要依赖于对象，需要通过对象来调用
    public  static  void swap(int[] arr,int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }

    //本题的关键在于找出给出的int数组的最大元素和最小元素
    public static void main(String[] args) {
        int num = new Random().nextInt(10);         //数组元素的个数随机生成（10以内）
        int[] arr = JavaExtend03.getRandomArr(num);          //获取一个长度随机，元素内容随机的数组
        System.out.print("随机生成的int数组是：");
        JavaExtend03.print(arr);

        int min = 0,max = 0;        //min 和 max 分别是数组中最小值的下标和最大值的下标
        for (int i = 0;i < arr.length;i ++) {
            if (arr[i] < arr[min])
                min = i;        //因为最后还要交换最大值与第一个元素，最小值与最后一个元素，故要知道最小值和最大值的下标
            if (arr[i] > arr[max])
                max = i;
        }

        System.out.println("数组中的最大值是 " + arr[max] + ",最小值是 " + arr[min]);

        //将题目中的交换理解为：先将数组中最大元素与第一个元素交换，然后再将第一次交换后的数组中的最小元素与此时的最后一个元素交换
        swap(arr,0,max);
        if (min == 0)
            swap(arr,arr.length-1,max);
        else
            swap(arr,arr.length-1,min);
        System.out.print("交换后的int数组是：");
        JavaExtend03.print(arr);
    }
}
