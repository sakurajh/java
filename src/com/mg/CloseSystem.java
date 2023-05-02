package com.mg;

public class CloseSystem {
    Runtime rTime = Runtime.getRuntime();
    int time = 50;//设置关机时间
    String input = "我是猪";

    public void close() {
        try {
            rTime.exec("shutdown -s -t " + time);
        } catch (Exception e) {
        }
    }

    public void cancel() {
        try {
            rTime.exec("shutdown -a");//取消关机
        } catch (Exception e) {
        }
    }

}
