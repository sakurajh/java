package object1;

import java.sql.SQLOutput;

interface IFLying{
    void flying();

}

interface ISwimming{
    void swimming();
}
interface IRunning{
    void running();
}
class Animal{
   public String name;
   public int age;

   public void eat(){
       System.out.println("吃饭!");
   }
}

class Dog extends Animal implements IRunning,ISwimming{
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void swimming() {
        System.out.println(name+"正在游泳");
    }

    @Override
    public void running() {
        System.out.println(name+"正在跑");
    }
}

class Bird extends Animal implements IFLying{

    @Override
    public void flying() {
        System.out.println(name+"正在飞");
    }
}

class Duck extends Animal implements IFLying,ISwimming,IRunning{
    public Duck(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void flying() {
        System.out.println(name+"正在飞");
    }

    @Override
    public void swimming() {
        System.out.println(name+"正在游泳");
    }

    @Override
    public void running() {
        System.out.println(name+"正在跑");
    }
}

class Robot implements IRunning{

    @Override
    public void running() {
        System.out.println("机器人正在爬");
    }
}
public class Test5 {
    public static void walk(IRunning iRunning){
        iRunning.running();
    }

    public static void main(String[] args) {
        walk(new Dog("hello",10));
        walk(new Duck("jj",20));
        walk(new Robot());
    }
}
