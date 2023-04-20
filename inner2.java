class OuterClass2{
    public int data1=1;
    int data2=2;
    public static int data3=3;

    public void test(){
        System.out.println("Out::test()");
    }
    /**
    1.如何获取静态内部类对象？
    OuterClass2.InnerClass2 innerClass2=new OuterClass2.InnerClass2();
    2.静态内部当中，不能访问外部类的非静态成员。外部类的非静态成员，
     需要通过外部类的对象的引用才能访问,
     非要访问：OuterClass2 outerClass2=new OuterClass2();
              System.out.println(outerClass2.data1);
     **/
    static class InnerClass2{
        public int data4=4;
        int data5=5;
        public static int data6=6;
        public void func(){
            System.out.println("Out::func()");
            OuterClass2 outerClass2=new OuterClass2();
            System.out.println(outerClass2.data1);
//            System.out.println(data1);
//            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println(data6);
        }
    }
}
public class inner2 {

    public void func(){
        //局部内部类
        /*
        1. 局部内部类只能在所定义的方法体内部使用
        2. 不能被public、static等修饰符修饰
        3. 编译器也有自己独立的字节码文件，命名格式：外部类名字$数字内部类名字.class
        4. 几乎不会使用
         */
        class Inner{
            public void test(){
                System.out.println("fafafafafaf");
            }
        }
        Inner inner=new Inner();
        inner.test();
    }
    public static void main(String[] args) {
        OuterClass2.InnerClass2 innerClass2=new OuterClass2.InnerClass2();
    }
}
