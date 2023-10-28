package com.baidou;

import java.util.Scanner;

/**
 * @Author 吴嘉旭
 * @Date 2023-02-03-19:59
 * @Description:
 * 接收用户输入的身高和体重, 将判断结果输出
 * 过轻：低于18.5
 * 正常：18.5 ~ 22.9
 * 偏胖：23 ~ 24.9
 * 肥胖：25 ~ 29.9
 * 重度肥胖：高于30
 * 极度肥胖：高于40
 * BMI 指数测试 BMI = 体重 (kg) / 身高² (m)
 */
public class If_BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.接收用户输入
        System.out.print("请输入身高(m):");
        double height = scan.nextDouble();
        System.out.print("请输入体重(kg):");
        double weight = scan.nextDouble();
        //2.计算BMI
        double BMI = weight / Math.pow(height,2);
        //3.定义级别
        String level = "";
        //3.分类讨论
        if (BMI < 18.5)
            level = "过轻";
        else if (BMI <= 22.9)
            level = "正常";
        else if (BMI >= 23 && BMI <= 24.9)
            level = "偏胖";
        else if (BMI >= 25 && BMI <= 29.9)
            level = "肥胖";
        else if (BMI > 30)
            level = "重度肥胖";
        else if (BMI > 40)
            level = "极度肥胖";
        System.out.println("您的身高为:"+height+",体重为:"+weight+",BMI等级为:"+level);
    }
}

