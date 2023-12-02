package com.baidou;


abstract class Role {
    private String name;
    public abstract int attack();
    //获得名字
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\''+"，";
    }
    //设置名字
    public void setName(String name) {
        this.name = name;
    }
}


class Magicer extends Role{
    private int level;

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Magicer{" +super.toString()+
                "level=" + level +
                '}';
    }
    //设置魔法等级
    public void setLevel(int level) {
        if (level<=10&&level>=1){
        this.level = level;
        }else return;
    }
    //魔法师伤害数值
    @Override
    public int attack() {
        return level*5;
    }
}




class Soldier extends Role{
    private int hurt;

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
    //战士伤害
    @Override
    public int attack() {
        return hurt;
    }

    @Override
    public String toString() {
        return "Soldier{" +super.toString()+
                "hurt=" + hurt +
                '}';
    }
}


class Team {
    private Role[] roles=new Role[6];
    private int i=0;
    //添加成员模块
    public void addMember(Role role){
        if (this.i<=6){
        roles[i]=role;
        this.i++;
        }else return;
    }
    //总伤害模块
    public int attackSum(){
        int sum=0;
        for (Role role:roles) {
            if (role instanceof Magicer){
                Magicer magicer=(Magicer)role;
                sum+=magicer.attack();
            }else if (role instanceof Soldier){
                Soldier soldier=(Soldier)role;
                sum+=soldier.attack();
            }else continue;
        }
        return sum;
    }
    //统计成员模块
    public void members(){
        int i=0;
        Role[] roles=new Role[6];
        for (Role role:this.roles) {
            if (role instanceof Magicer){
                Magicer magicer=(Magicer)role;
                roles[i]=magicer;
                i++;
            }else if (role instanceof Soldier){
                Soldier soldier=(Soldier)role;
                roles[i]=soldier;
                i++;
            }else break;
        }
        for (Role role:roles) {
            if (role!=null) {
                System.out.println(role);
            }else break;
        }
    }

}



public class Demo11 {
    public static void main(String[] args) {
        //创建魔法师、战士、队伍的对象
        Magicer magicer = new Magicer();
        Soldier soldier = new Soldier();
        Team team = new Team();
        //设置魔法师的名字和
        magicer.setName("甘道夫");
        magicer.setLevel(5);
        soldier.setName("战士");
        soldier.setHurt(90);
        //把成员加入队伍
        team.addMember(magicer);
        team.addMember(soldier);
        //列出小组成员
        System.out.println("该小队成员为：");
        team.members();
        //列出小组的伤害
        System.out.print("该小队伤害为：");
        System.out.print(team.attackSum());
    }
}