import java.util.*;
class Vehicle{
    public double speed;
    public double size;
    void move(){
        System.out.println("Vehicle is moving!!!");
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    void speedUp(){
        speed+=5;
    }
    void speedDown() {
        speed-=5;
    }
}


public class TestVehicle {
    public static void main(String[]args){
        Vehicle vehicle=new Vehicle();
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入你要设置的速度:");
        int sc= reader.nextInt();
        vehicle.setSpeed(sc);
        System.out.println("请输入你要设置的体积:");
        int v= reader.nextInt();
        vehicle.size=v;
        System.out.println("该交通工具原始的速度为:"+vehicle.speed+"\n"+"体积为:"+v);
        vehicle.speedUp();
        System.out.println("该交通工具加速后的速度为:"+vehicle.speed);
        vehicle.speedDown();
        System.out.println("该交通工具减速后的速度为:"+vehicle.speed);
    }
}