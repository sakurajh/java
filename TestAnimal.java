package com.baidou;

class Animal {
    String name;
    int age;
 
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
 
    public void eat(){
        System.out.println(name + "吃饭");
    }
}
 
class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
 
    @Override
    public void eat(){
        System.out.println(name+"吃鱼~~~");
    }
}
 
class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }
 
    @Override
    public void eat(){
        System.out.println(name+"吃骨头~~~");
    }
}
 
 
///分割线//
 
public class TestAnimal {
    // 编译器在编译代码时，并不知道要调用Dog 还是 Cat 中eat的方法
    // 等程序运行起来后，形参a引用的具体对象确定后，才知道调用那个方法
    // 注意：此处的形参类型必须时父类类型才可以
    public static void eat(Animal a){
        a.eat();
    }
 
    public static void main(String[] args) {
        Cat cat = new Cat("元宝",2);
        Dog dog = new Dog("小七", 1);
        eat(cat);
        eat(dog);
    }
}
 