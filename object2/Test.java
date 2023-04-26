package object2;


import java.util.Arrays;
import java.util.Comparator;

//如果 我们以后自定义的类型 一定要记住如果比较大小，那么必须要让这个类具备可以比较的
//功能，此时可以选择实现接口Comparable
//                         比较器          《泛型》
class Student implements Comparable<Student>{
    public String name;
    public int age;


    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age-o.age>0){
            return 1;
        }else if(this.age-o.age<0){
            return -1;
        }else{
            return 0;
        }
        //return 0;
    }
}

//todo:Comparator接口当中 不止一个抽象方法，那么 为什么只需要实现一个compare方法就好了
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {

    public static void bubbleSort(Comparable[]array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    Comparable tmp=array[i];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("bi",10);
        students[1]=new Student("haha",13);
        students[2]=new Student("woo",15);

        bubbleSort(students);
        System.out.println(Arrays.toString(students));
    }
    public static void main4(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("bi",10);
        students[1]=new Student("haha",13);
        students[2]=new Student("woo",15);
        //AgeComparator ageComparator=new AgeComparator();
        NameComparator nameComparator=new NameComparator();
        Arrays.sort(students,nameComparator);

        System.out.println(Arrays.toString(students));
    }
    public static void main3(String[] args) {
        Student student=new Student("huazi",20);
        Student student1=new Student("dongzi",19);
        if(student.compareTo(student1)>0){
            System.out.println("student>student1");
        }else{
            System.out.println("student<student1");
        }
    }
    public static void main2(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("bit",10);
        students[1]=new Student("haha",13);
        students[2]=new Student("woo",15);
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        int[] array = {1, 4, 2, 5, 6, 7, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
