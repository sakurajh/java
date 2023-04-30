package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");

        System.out.println("请输入你要删除的图书");
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();
        //1.遍历数组当中是否有你要删除的书，有记录下标
        int index=-1;
        int currentSize= bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                index=i;
                break;
            }
        }
        //
        if(index==-1){
            System.out.println("没有你要删除的书");
            return;
        }
  //                             不-1就越界  4-1
        for (int i = index; i < currentSize-1; i++) {
            Book book=bookList.getPos(i+1);
            bookList.setBooks(book,i);
        }
        //每次删除都要置空
        //在java当中，引用对象才会置空
        bookList.setBooks(null,currentSize-1);

        bookList.setUsedSize(currentSize-1);
        System.out.println("删除成功!");
    }
}
