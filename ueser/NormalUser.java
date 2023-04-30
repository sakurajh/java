package ueser;

import operation.*;

import java.util.Scanner;

//普通用户
public class NormalUser extends User{

    public NormalUser(String name){
        super(name);

        //   接口  数组
        this.iOperations=new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };
    }
    public int  menu(){
        System.out.println("******************************");
        System.out.println("hello"+name+"欢迎来到sakura图书馆");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("******************************");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;


    }
}
