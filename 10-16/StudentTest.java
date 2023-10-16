import java.util.*;

class Student{
    String name;
    int age;
    double score;
    public Student(String name,int age,double score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public void outStu(){
        System.out.println("学生的名字为:"+name);
        System.out.println("学生的年龄为:"+age);
        System.out.println("学生的分数为:"+score);
    }
    public static void sortAge(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
    }
}

public class StudentTest {
    public static void main(String[] args) {
       Scanner reader=new Scanner(System.in);
        System.out.println("请输入你要写入的学生的个数:");
        int n=reader.nextInt();
        if(n<=0){
            System.out.println("输入人数错误,不能小于0!!!");
        }else{
            Student []student=new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.println("请输入第 " + (i + 1) + " 个学生的姓名:");
                String name=reader.next();
                System.out.println("请输入第 " + (i + 1) + " 个学生的年龄:");
                int age=reader.nextInt();
                System.out.println("请输入第 " + (i + 1) + " 个学生的成绩:");
                double score=reader.nextDouble();
                student[i]=new Student(name,age,score);
            }
            System.out.println("排序前的信息为:");
            for (int i = 0; i < n; i++) {
                System.out.println("----第"+i+"个学生的信息-----");
                student[i].outStu();
            }
            Student.sortAge(student);
	    System.out.println("*******************************");
            System.out.println("排序后的信息为:");
            for (int i = 0; i < n; i++) {
                System.out.println("----第"+i+"个学生的信息-----");
                student[i].outStu();
            }
//            for (Student x : student) {
//                x.outStu();
//                System.out.println("----第k个学生-----");
//            }
        }
        }
}
