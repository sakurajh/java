class OutClass{
    public int data1=1;
    int data2 = 2;
    public static int data3= 3;
    public void test(){
        System.out.println("OuterClass::test()");
    }
    //实力内部类
    //1.如何获取内部类的对象
    //OutClass.InnerClass innerClass=outClass.new InnerClass();
    //2.实例化内部类当中 不能有静态的成员变量,
    //非要定义要用static final修饰
    //3.在实例化内部类当中，如何访问外部类当中，相同的成员变量？
    //在实例化内部类当中  获取外部类的this：OuterClass.this.data1;
    class InnerClass{
        public  int data1=111;
        public int data4=4;
        int data5=5;
        //             常量的意思
        public static final int data6=6;
        //public static int data6; error//先执行static再去实例化对象,优先级高
        public void func(){
            System.out.println("InnerClass::func()");
            System.out.println(OutClass.this.data1);
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println(data6);
        }
        public void test(){
            //static final int c=0;
            System.out.println("OuterClass::test()");
            final int SIZE=10;//定义常量，常量是在程序编译的时候确定的
            //一旦初始化，就不能进行修改。0

        }
    }

}
public class inner{
    public static void main(String[] args) {
        OutClass outClass=new OutClass();
        OutClass.InnerClass innerClass=outClass.new InnerClass();
        innerClass.func();

    }
    public static void main1 (String[] args) {
        OutClass outClass=new OutClass();
        System.out.println(outClass.data1);
        //
        OutClass.InnerClass innerClass=outClass.new InnerClass();
    }
}
