package com.baidou;

import javax.swing.*;

public class TestDialog {
	public static void main(String args[]) {
        String word = JOptionPane.showInputDialog(null, "请输入一个英文单词：");
        if (word == null || word.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "您没有输入任何内容。", 
            		"警告", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Object[] options = { "转换为大写", "转换为小写", "反转显示" };
        Object  choice = JOptionPane.showInputDialog(null, "请选择要执行的操作:\n", "输入", 
        		JOptionPane.QUESTION_MESSAGE,null,options, "转换为大写");//返回值是object
        switch (choice.toString()) {
            case "转换为大写":
                word = word.toUpperCase();
                break;
            case "转换为小写":
                word = word.toLowerCase();
                break;
            case "反转显示":
                word = new StringBuilder(word).reverse().toString();
                break;
            default:
                return;
        }

        JOptionPane.showMessageDialog(null, "处理后的单词为：" + word, "处理结果", 
        		JOptionPane.INFORMATION_MESSAGE);
	}
}
