package object;
/*
1.抽象类 使用abstract修饰类
2.抽象类当中可以包含普通类所能包含的成员
3.抽象类和普通类不一样的是，抽象类当中可以包含抽象方法。
4.抽象方法使用的是abstract修饰的，这个方法没有具体的实现
5.不能实例化抽象类
6.抽象列存在的最大意义就是为了传承
7.如果一个普通类 继承了一个抽象类 此时必须重写抽象类的方法
8.如果一个抽象类A继承了抽象类B，此时A当中不需要重写B的抽象方法，
但是如果A再被普通类继承，就需要重写。
9.抽象方法不能是私有的，可以是protect的
也就是要满足重写的规则
10.final和abstract是矛盾的
11.抽象类当中可以有构造方法，
为了方便子类能够直接调用，来初始化抽象类当中的成员
 */

abstract class Shape{
    //public static int a=10;
    //抽象方法
    public abstract void draw();
    public void func(){
    }
}

abstract class  A extends  Shape{

}

class B extends A{
    @Override
    public void draw() {

    }
}
class Rect1 extends Shape {
    @Override
    public void draw(){
        System.out.println("画矩形");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}


public class Test {

    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        //Shape shape=new Shape();
        Rect rect=new Rect();
        drawMap(rect);
        drawMap(new Cycle());
        Shape shape=new Rect();

    }
}

