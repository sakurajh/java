package com.baidou;

import  javax.swing.*;

import  java.awt.*; 


public class MyFrame extends JFrame {
    JPanel jP1,jp2,jp3;
    JLabel label1,label2;
    JButton button1,button2;
    JTextField text;
    JPasswordField password;

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }

    public MyFrame(){
        init();
        setTitle("登录界面");
        setBounds(300,300,250,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new GridLayout(3,1));
        jP1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        label1 = new JLabel("用户名");
        label2 = new JLabel("密 码");


        text = new JTextField(10);
        password = new JPasswordField(10);


        button1 = new JButton("登录");
        button2 = new JButton("取消");

        jP1.add(label1);
        jP1.add(text);

        jp2.add(label2);
        jp2.add(password);

        jp3.add(button1);
        jp3.add(button2);

        add(jP1);
        add(jp2);
        add(jp3);
    }
}

