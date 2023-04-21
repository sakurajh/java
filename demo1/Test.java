package demo1;
class Shape{
    public void draw(){
        System.out.println("画图形");
    }
}
class Rect extends Shape{
    @Override
   public void draw(){
        System.out.println("画矩形");
    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
//在drawMap方法中，Shape shape引用 引用的子类对象不一样
//调用方法表现出来的行为不一样， 我们把这种思想叫做多态。
public class Test {
    public static void drawShapes(){
        Shape[]shapes={new Cycle(),new Rect(),new Cycle(),new Rect(),new Shape()};
        //数组的遍历
        for (Shape s:shapes) {
            s.draw();
        }
    }
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        drawShapes();
    }
    public static void main2(String[] args) {
        Rect rect=new Rect();
        drawMap(rect);
        drawMap(new Cycle());
    }


    public static void main1(String[] args) {
        Shape shape=new Rect();
        shape.draw();
        Shape shape2=new Cycle();
        shape2.draw();
    }
}
