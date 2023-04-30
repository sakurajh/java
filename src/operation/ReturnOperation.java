package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书!");
        System.out.println("请输入你要归还的图书");
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();

        int currentSize= bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                book.setBorrowed(false);
                System.out.println("归还成功!");
                return;
            }
        }
        System.out.println("没有你要归还的图书!");

    }
}
