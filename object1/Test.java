package object1;
/*
1.使用Interface来修饰接口
2.接口当中的成员方法，不能有具体的实现
   1.抽象方法：默认是public abstract的方法
   2.JDK1.8开始允许有可以实现的方法，但是这个方法只能是default修饰的
   3.可以实现有一个静态方法
3.成员变量默认是public static final修饰的
4.接口不能被实例化
5.类和接口直接采样implements
6.子类重写方法，必须写public修饰
7.接口中不能有静态代码块和构造方法
8.如果你不想实现接口的方法，那么就把这个定义为抽象类
但是如果这个类被其他类继承，那么必须重写
9.一个类可以实现多个接口，使用implements用逗号隔开[解决多继承问题]
 */
interface ITest{
    int size=10;//public static final
    void draw();//public abstract
    default public void func(){
        System.out.println("默认方法!");
    }

    public static void func1(){

    }
}
class A implements ITest{
    @Override
    public void draw() {
        System.out.println("必须重写");
    }
}
public class Test {
    public static void main(String[] args) {
        //IShape iShape=new IShape();

    }
}
