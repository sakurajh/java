package game;

import javax.swing.JFrame;
public class Ui {
    public static void main(String[] args){
        JFrame frame=new JFrame("无尽版贪吃蛇");
        frame.setSize(1500, 1000);
        frame.setLocationRelativeTo(null);//居中显示
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(new MyPanel());
        frame.setVisible(true);
    }

}
