package object1;

interface A1{
    void func();
}

interface B1{
    void func2();
}

interface D extends A1,B1{
    void func3();
}
class E implements D{

    @Override
    public void func() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }
}
 class C1 implements A1,B1{

     @Override
     public void func() {

     }

     @Override
     public void func2() {

     }
 }
public class Test4 {
}
