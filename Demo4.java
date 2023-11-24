package com.baidou;

class Animal{
    public void eat()｛
        System.out.println("动物吃东西！");
    ｝
}
class Cat extends Animal {  
    public void eat() {  
        System.out.println("吃鱼");  
    }  
   
    public void catchMouse() {  
        System.out.println("抓老鼠");  
    }  
}  
​
class Dog extends Animal {  
    public void eat() {  
        System.out.println("吃骨头");  
    }  
}
​
public class Demo4{
    public static void main(String[] args){
        Animal a = new Cat();
        a.eat();
        a.catchMouse();//编译报错，编译看左边，Animal没有这个方法
    }
}