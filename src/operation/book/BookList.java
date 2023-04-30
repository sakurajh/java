package book;

public class BookList {

    private Book[] books=new Book[10];
    private int usedSize;//存储书的个数
    public BookList(){
        //事先通过构造方法 初始化的时候 给数组里面预存三本书，usedSize=3
        books[0]=new Book("三国演义","罗贯中",98,"小说");
        books[1]=new Book("西游记","吴承恩",75,"小说");
        books[2]=new Book("红楼梦","曹雪芹",65,"小说");
        this.usedSize=3;
    }
    //这里应该去写一些 操作这个数组的方法，但是不这么做，换一种做法


    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getPos(int pos){
        return books[pos];
    }
    //存贮一本书道指定位置,最后可以存储书的位置
    public void setBooks(Book book,int pos){
        books[pos]=book;
    }
}
