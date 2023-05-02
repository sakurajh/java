package com.mg;
import javax.swing.*;
import java.awt.*;

public class Countdown extends Thread {
    CloseSystem cs = new CloseSystem();
    String afx;

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cs.time--;
            if (cs.time == 5) {//当只剩下5秒时
                JLabel sb = new JLabel("倒计时五秒你确定不输入吗？");
                sb.setFont(new java.awt.Font("隶书", 1, 24));
                sb.setBackground(Color.GREEN);
                JPanel pa = new JPanel();
                pa.add(sb);
                MyFrame.myJF.add(pa);
                MyFrame.myJF.setVisible(true);
                MyFrame.edit.setVisible(false);
                MyFrame.ca.setEnabled(false);
                MyFrame.ok.setEnabled(false);
            }
            afx = "倒计时：" + cs.time;
            MyFrame.label.setText(afx);
            MyFrame.jp03.add(MyFrame.label);
            if (cs.time == 0) {
                System.exit(0);
            }
        }
    }

}
