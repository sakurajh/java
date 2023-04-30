package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {


    public void work(BookList bookList){
        //添加图书
        System.out.println("新增图书");
        System.out.println("请输入你要新增的图书的名字");
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();
        System.out.println("请输入你要新增的图书的作者");
        String author =scanner.nextLine();
        System.out.println("请输入你要新增的图书的类型");
        String type =scanner.nextLine();
        //先输入line再输入int否则line会读如int的换行符
        //或者把回车先读进去\
        //scanner.nextInt();
        System.out.println("请输入你要新增的图书的价格");
        int price=scanner.nextInt();


        Book book=new Book(name,author,price,type);
        //1.获取当前可以存放书的位置
        int currentSize= bookList.getUsedSize();
        //2.把书放到指定位置
        bookList.setBooks(book,currentSize);
        //3.书的有效个数+1
        bookList.setUsedSize(currentSize+1);
        System.out.println("新增成功");





    }

}
