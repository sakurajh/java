package com.mg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame {
    Countdown cd = new Countdown();
    JLabel caption = new JLabel("电脑将在" + cd.cs.time + "秒后关机，输入”" + cd.cs.input + "“则取消！");
    static JLabel label = new JLabel();
    static JFrame myJF = new JFrame("关机程序");
    static JButton ok = new JButton("确定");
    static JButton ca = new JButton("退出");
    static JTextField edit = new JTextField(8);
    JPanel jp01 = new JPanel();
    JPanel jp02 = new JPanel();
    static JPanel jp03 = new JPanel();
    JPanel jp04 = new JPanel();
    CloseSystem cs = new CloseSystem();

    public MyFrame() {
        myJF.setSize(500, 500);
        myJF.setLocation(400, 100);
        myJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJF.getRootPane().setDefaultButton(ok);//响应回车键
        caption.setFont(new java.awt.Font("行楷", 1, 16));
        caption.setForeground(Color.BLUE);
        label.setFont(new java.awt.Font("行楷", 1, 24));
        label.setForeground(Color.RED);
        edit.setFont(new java.awt.Font("行楷", 1, 18));
        jp01.add(caption);
        jp02.add(edit);
        jp03.add(label);
        jp04.add(ca);
        jp04.add(ok);
        myJF.add(jp01);
        myJF.add(jp02);
        myJF.add(jp03);
        myJF.add(jp04);
        myJF.setLayout(new GridLayout(5, 1));
        cs.close();
        myJF.setVisible(true);

        cd.start();

        ok.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {
                if (edit.getText().equals(cs.input)) {
                    cs.cancel();
                    JOptionPane.showMessageDialog(null, "关机已取消！",
                            "", JOptionPane.INFORMATION_MESSAGE);
                    cd.stop(); //线程停止
                    edit.setEnabled(false);
                    ok.setEnabled(false);
                    ca.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "输入错误！",
                            "提示", JOptionPane.ERROR_MESSAGE);
                    edit.setText("");
                }
            }
        });
        ca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "确定要退出吗？电脑依然会关机的！",
                        "提示", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
