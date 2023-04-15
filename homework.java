
import java.util.Random;
import java.util.Scanner;
public class homework {
    public static void  func(int x,int y){
        Random random =new Random();
        int hit=random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        if(a>0&&b>0){
            for (int i = 0; i < 100; i++) {
                if(a>b){
                    System.out.println(a+"击打"+b);
                    b-=hit;
                }
                if(a<b){
                    System.out.println(a+"被b击打"+b);
                    a-=hit;
                }
            }
            if(a==0){
                System.out.println(a+"ko"+b);
            }else{
                System.out.println(a+"被ko"+b);
            }
        }
    }
    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        func(scanner.nextInt(), scanner.nextInt());
        while(scanner.hasNextInt()){

        }
    }
}
class Person1{
    public String name;
    public int blood;
    public String sex;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getSex() {
        return sex;
    }

    public String setSex(String sex) {
        this.sex = sex;
        return sex;
    }
}


