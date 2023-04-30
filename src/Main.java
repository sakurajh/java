import book.BookList;
import ueser.AdminUser;
import ueser.NormalUser;
import ueser.User;

import java.util.Scanner;


public class Main {
    //利用向上转型  来确定是什么对象
    public static User login(){
        System.out.println("请输入你的姓名:");
        Scanner scanner=new Scanner(System.in);
        String userName= scanner.nextLine();

        System.out.println("请输入你的身份：1.管理员  0.普通用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return new AdminUser(userName);
        }else {
            return new NormalUser(userName);
        }

    }
    public static void main(String[] args) {
        //0.准备数据
        BookList bookList=new BookList();

        //1.登录
        User user=login();
        //user这个引用 引用的对象可能不一样
        //          引用谁就是调用谁的菜单
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

}
