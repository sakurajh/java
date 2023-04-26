package object2;
//                       克隆（空接口）
class Money implements Cloneable{
    public double m=12.5;
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
class Person implements Cloneable{
    public int id;
    //             在堆上
    public Money money=new Money();

    @Override
    //不同包需要super访问
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //深拷贝  独立
        Person tmp=(Person) super.clone();//克隆了person
        tmp.money=(Money) this.money.clone();//克隆了money
        return tmp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
public class Test2 {
    //                                        声明
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person=new Person();
        person.id=99;
        Person person1=(Person)person.clone();
        person1.money.m=199;
        System.out.println(person.money.m);
        System.out.println(person1.money.m);
    }
}
