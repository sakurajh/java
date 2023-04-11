package game1;

import java.util.Random;

public class test {
    public String name;
    public int blood;
    public String sex;

    public test() {
    }
    public test(String name, int blood, String sex) {
        this.name = name;
        this.blood = blood;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + ",sex=" + sex + "}";
    }

    public void attack(test test) {
        Random x = new Random();
        int hit = x.nextInt(10) + 10;
        int remainblood = test.getBlood() - hit;
        if(remainblood<0){
            remainblood=0;
        }else{
            remainblood=remainblood;
        }
        //remainblood = remainblood < 0 ? remainblood : 0;
        test.setBlood(remainblood);
        System.out.println(
                this.getName() + "对" + test.getName() + "踢出一脚"
                        + hit + "点伤害" + test.getName() + "还有血量为" + remainblood);


    }
}



