package object1;

interface USB {
    void openDevice();
    void closeDevice();
}

abstract class B implements USB{

}
class Mouse implements USB {
    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}

  class KeyBoard implements USB {
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }
    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }
    public void inPut(){
        System.out.println("键盘输入");
    }
}

  class Computer {
    public void powerOn(){
        System.out.println("打开笔记本电脑");
    }

    public void powerOff(){
        System.out.println("关闭笔记本电脑");
    }

    public void useDevice(USB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.inPut();
        }
        usb.closeDevice();
    }
}

public class Test3 {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        computer.useDevice(new KeyBoard());
        computer.useDevice(new Mouse());
        computer.powerOff();
    }
}
