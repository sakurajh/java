package ueser;

import book.BookList;
import operation.IOperation;

//抽象类
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;//只是定义数组 没有初始化，没有分配内存

    public User(String name){
        this.name=name;

    }
    public abstract int menu();
    public  void doOperation(int choice ,BookList booklist){
        iOperations [choice].work(booklist);
    }


}
