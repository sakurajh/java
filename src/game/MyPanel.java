package game;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

//画布类
public class MyPanel extends JPanel implements KeyListener,ActionListener{//继承
    private static final Component This = null;
    //键盘监听交互接口
    int length;
    int score;
    int[] snakeX=new int[500];//坐标
    int[] snakeY=new int[500];
    String fx;
    boolean ifStart=false;
    //定时器
    Timer timer =new Timer(100,this);
    int foodx;
    int foody;
    Random random =new Random();

    public MyPanel(){
        init();
        //添加监听事件
        this.setFocusable(true);
        this.addKeyListener(this);
        score=0;
    }
    public void init(){
        length=3;
        fx="r";
        //初始化小蛇的位置
        snakeX[0]=100;
        snakeY[0]=150;
        snakeX[1]=75;
        snakeY[1]=150;
        snakeX[2]=50;
        snakeY[2]=150;
        foodx=25+25*random.nextInt(57);
        foody=125+25*random.nextInt(27);
        System.out.println(foodx);
        System.out.println(foody);
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g){//画笔对象
        super.paintComponent(g);
        //绘制顶部的标题
        new ImageIcon("C:/Users/Desktop/img/title2.png").paintIcon(this,g,25,11);//创建对象
        //绘制游戏区域
        g.fillRect(25, 125, 1450, 700);
        //绘制小蛇
        //蛇头
        new ImageIcon("C:/Users/Desktop/img/l.png").paintIcon(this, g, snakeX[0], snakeY[0]);

        //蛇身
        for(int i=1;i<length;i++){
            new ImageIcon("C:/Users/Desktop/img/body.png").paintIcon(This, g, snakeX[i], snakeY[i]);
        }
        //游戏的提示语
        if(ifStart==false){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按压空格键继续游戏", 550,500);
            g.drawString("无尽模式", 650,400);
        }
        //画出食物的位置
        new ImageIcon("C:/Users/Desktop/img/body.png").paintIcon(this, g, foodx, foody);
    }

    @Override//按压
    public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        if(keyCode==KeyEvent.VK_SPACE){
            ifStart=!ifStart;
        }
        if(ifStart==true){
            if(keyCode==KeyEvent.VK_LEFT&&fx!="r"){
                fx="l";
            }else if(keyCode==KeyEvent.VK_RIGHT&&fx!="l"){
                fx="r";
            }else if(keyCode==KeyEvent.VK_UP&&fx!="d"){
                fx="u";
            }else if(keyCode==KeyEvent.VK_DOWN&&fx!="u"){
                fx="d";
            }
        }
        repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //改变蛇的位置
        if(ifStart==true){
            for(int i=length-1;i>0;i--){
                snakeX[i]=snakeX[i-1];
                snakeY[i]=snakeY[i-1];
            }
            if(fx.equals("l")){
                snakeX[0]=snakeX[0]-25;
                if(snakeX[0]<25){
                    snakeX[0]=1450;
                }
            }else if(fx.equals("r")){
                snakeX[0]=snakeX[0]+25;
                if(snakeX[0]>1450){
                    snakeX[0]=25;
                }
            }else if(fx.equals("u")){
                snakeY[0]=snakeY[0]-25;
                if(snakeY[0]<120){
                    snakeY[0]=800;
                }
            }else if(fx.equals("d")){
                snakeY[0]=snakeY[0]+25;
                if(snakeY[0]>800){
                    snakeY[0]=120;
                }
            }
            //判断是否吃了食物
            if(snakeX[0]==foodx&&snakeY[0]==foody){
                length++;
                score++;
                if(score==100){
                    ifStart=!ifStart;
                }
                foodx=25+25*random.nextInt(57);
                foody=125+25*random.nextInt(27);
                System.out.print("当前食物坐标("+foodx+",");
                System.out.print(foody+")");
                System.out.println("|||当前分数："+score+" ");
            }
            repaint();
        }
        timer.start();
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }
}