package com.baidou;

import javax.swing.*;

public class exer1 {
    JFrame s=new JFrame("程序练习");
    JTextArea text=new JTextArea(10,40);
    JButton b=new JButton(new AbstractAction("消息对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
           //点击按钮后弹出一个消息对话框，并且显示文本域中的内容
            String ss=text.getText();//获取文本域内容
            //参数最后一个表示指定消息对话框的类型：错误消息，警告消息，问题消息......
            //错误消息
            //JOptionPane.showMessageDialog(s,text,"消息对话框",JOptionPane.ERROR_MESSAGE);
            //警告消息
            JOptionPane.showMessageDialog(s,text,"消息对话框",JOptionPane.WARNING_MESSAGE);
            //问题消息
            //JOptionPane.showMessageDialog(s,text,"消息对话框",JOptionPane.QUESTION_MESSAGE);
           // 消息对话框
            // JOptionPane.showMessageDialog(s,text,"消息对话框",JOptionPane.INFORMATION_MESSAGE);
 
            //指定插入的图片
           // JOptionPane.showMessageDialog(s,ss,"消息对话框",JOptionPane.ERROR_MESSAGE,new ImageIcon());
        }
    });
    public void init(){
        //组装组件
        s.add(text);
        s.add(b,BorderLayout.SOUTH);
 
        s.pack();
        s.setVisible(true);
 
        s.setDefaultCloseOperation(3);
    }
}