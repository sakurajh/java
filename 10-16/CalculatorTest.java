import java.util.*;
class Calculator{
        public int a;
        public int b;

        int add(){
            return a+b;
        }
        int sub(){
            return a-b;
        }
        int mul(){
            return a*b;
        }
        int div(){
            if(b!=0){
                return a/b;
            }else{
                return 0;
            }
        }
}
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("输入两个数进行计算:");
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        reader.close();
        Calculator calculator = new Calculator();
        calculator.a = num1;
        calculator.b = num2;
        int sum = calculator.add();
        int sub = calculator.sub();
        int mul = calculator.mul();
        int div = calculator.div();
        if (num2 != 0) {
            System.out.println("和为:" + sum);
            System.out.println("差为:" + sub);
            System.out.println("积为:" + mul);
            System.out.println("商为:" + div);
        } else {
            System.out.println("除数不能为0,请重新输入!!!");
        }
    }
}