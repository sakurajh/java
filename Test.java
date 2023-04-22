//1. 一般一个文件当中只定义一个类
//2. main方法所在的类一般要使用public修饰(注意：Eclipse默认会在public修饰的类中找main方法)
//3. public修饰的类必须要和文件名相同
//4. 不要轻易去修改public修饰的类的名称，如果要修改，通过开发工具修改(给同学演示)。
//this引用指向当前对象(成员方法运行时调用该成员方法的对象)，在成员方法中所有成员变量的操作，都是通过该
//引用去访问
//当我们没有提供任何的构造方法的时候，编译器会帮助我们提供一个不带参数的构造方法
// 当构造方法调用完成后，对象才实际产生了
//构造方法可以被重载
class Test{
class person{
    //属性
    public int age;
    public String name;
    //行为
    public void eat(){
        System.out.println("吃饭");
    }
}
//class 类名-->大驼峰
// 构造方法：
// 名字与类名相同，没有返回值类型，设置为void也不行
// 一般情况下使用public修饰
// 在创建对象时由编译器自动调用，并且在对象的生命周期内只调用一次
class WashMachine{
    //属性[字段]-->成员属性
    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double length; // 长
    public double width; // 宽
    public double height; // 高
    public String color; // 颜色
    //行为[方法]-->成员方法

}

    public static void main(String[] args) {
        System.out.println();
    }
    }
