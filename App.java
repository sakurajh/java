package com.baidou;

import javax.swing.*;

public class App extends JFrame{
    static JFrame jFrame=new JFrame("复选框和单选组按钮选取框");
    static JCheckBox jCheckBox1=new JCheckBox("粗体",true);
    static JCheckBox jCheckBox2=new JCheckBox("斜体");
    static JCheckBox jCheckBox3=new JCheckBox("下划线");
    static JRadioButton jRadioButton1=new JRadioButton("红色",true);
    static JRadioButton jRadioButton2=new JRadioButton("绿色",true);
    static JRadioButton jRadioButton3=new JRadioButton("蓝色");
    public static void main(String[] args) {
        ButtonGroup buttonGroup=new ButtonGroup();
        jFrame.setLocation(200,150);
        jFrame.setSize(300,220);
        jFrame.setLayout(null);
        jCheckBox1.setBounds(20,20,50,20);
        jCheckBox2.setBounds(20,40,50,20);
        jCheckBox3.setBounds(20,60,70,20);
        jRadioButton1.setBounds(40,100,50,20);
        jRadioButton2.setBounds(40,120,50,20);
        jRadioButton3.setBounds(40,140,50,20);

        jFrame.add(jCheckBox1);
        jFrame.add(jCheckBox2);
        jFrame.add(jCheckBox3);
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        jFrame.add(jRadioButton1);
        jFrame.add(jRadioButton2);
        jFrame.add(jRadioButton3);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
