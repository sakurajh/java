package object1;
interface IShape{
    void draw();
}
//alt+enter 快速重写
class Rect implements IShape{

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
class Flower implements IShape{

    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Cycle implements IShape{

    @Override
    public void draw() {
        System.out.println("圆");
    }
}
public class Test2 {
    public static void drawMap(IShape iShape){
        iShape.draw();
    }
    public static void main(String[] args) {
        Rect rect=new Rect();
        drawMap(rect);
        drawMap(new Cycle());
        drawMap(new Flower());

        //IShape iShape=new Cycle();
    }
}
