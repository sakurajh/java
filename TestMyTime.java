package com.baidou;

class MyTime {  
    private int hour;  
    private int minute;  
    private int second;  
    
    public MyTime(int h, int m, int s) {  
        this.hour = h;  
        this.minute = m;  
        this.second = s;  
    }  
   
    public void display() {  
        System.out.println(hour + " : " + minute + " : " + second);  
    }  
    
    public void addSecond(int s) {  
        this.second += s;  
        while (this.second < 0) {  
            this.second += 60;  
            this.minute--;  
        }  
        while (this.second >= 60) {  
            this.second -= 60;  
            this.minute++;  
        }  
    }  
 
    public void addMinute(int m) {  
        this.minute += m;  
        while (this.minute < 0) {  
            this.minute += 60;  
            this.hour--;  
        }  
        while (this.minute >= 60) {  
            this.minute -= 60;  
            this.hour++;  
        }  
    }  
  

    public void addHour(int h) {  
        this.hour += h;  
        while (this.hour < 0) {  
            this.hour += 24;  
        }  
        while (this.hour >= 24) {  
            this.hour -= 24;    
        }  
    }  
}
public class TestMyTime {
	public static void main(String[] args) {
		MyTime mytime=new MyTime(5,30,20);
		System.out.println("开始时间:");
		mytime.display();
		mytime.addHour(2);
		mytime.addMinute(33);
		mytime.addSecond(45);
		System.out.println("------------------------");  
		System.out.println("改变后时间:");
		mytime.display();
	}
}
