package object1;


import java.util.Objects;

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
 //手写的
    //@Override
    //比较对象中内容是否相同的时候，一定要重写equals方法。
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false ;
//        }
//        if(this == obj) {
//            return true ;
//        }
//        //不是person的对象  是不是同种类型
//        Person per=(Person)obj;
//        if(this.name.equals(per.name)&&this.age==per.age){
//            return true;
//        }
//        return false;
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name,age);
//    }
   //系统自动生成的
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        //计算对象的位置
        return Objects.hash(name, age);
    }
}
class Student{

}

public class Test6 {

    public static void func(Object obj){
    }

    public static void main(String[] args) {
        Person person=new Person("name",12);
        Person person1=new Person("name",12);
        //                 判断变量的地址是否一样
        System.out.println(person1.equals(person));//false
        System.out.println("====================");
        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());
    }
}
