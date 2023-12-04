package com.baidou;

public class Demo13 {
    public static void main(String[] args) {
         try {
             Studen stu=new Studen();
             stu.register(-1003);
             System.out.println(stu);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
    }
}
class Studen{
    private int id;
    public void register(int id) throws Exception {
         if(id>0) {
             this.id =id;
         }else {
             //System.out.println("输入的id不合法");
             //手动抛出异常
             //throw new RuntimeException("你输入的数据不合法");
             throw new Exception("输入的数据不合法");
         }
    }
    @Override
    public String toString() {
         return "Studen [id=" + id + "]";
    }
}
