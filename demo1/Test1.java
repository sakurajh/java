package demo1;

class B {
    public B() {
// do nothing
        func();
    }
    public void func() {
        System.out.println("B.func()");
    }
}
class D extends B {
    private int num = 1;
    @Override
    public void func() {
        System.out.println("D.func() " + num);
    }
}
public class Test1 {
    public static void main(String[] args) {
        D d = new D();
    }
}
/*
构造 D 对象的同时, 会调用 B 的构造方法.
B的构造方法中调用了 func方法, 此时会触发动态绑定, 会调用到 D中的 func
此时 D对象自身还没有构造, 此时 num 处在未初始化的状态, 值为 0. 如果具备多态性，num的值应该是1.
所以在构造函数内，尽量避免使用实例方法，除了final和private方法。
 */