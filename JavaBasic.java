package com.baidou;
import java.util.*;
public class JavaBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入井深（m）：");
        Double wellDepth = input.nextDouble();
        
        /*
        int day = (int)((wellDepth -5) / 1.5) + ((wellDepth -5) % 1.5 == 0 ? 1:2 );
        System.out.print("蜗牛需要 " + day +"  天才能从井底到爬出来。");
         */

        int day = 1;    //蜗牛爬出井需要的天数,无论井深是多少，天数最少是1天。
        double sum = 0; //蜗牛爬过的距离
        while (true) {
            sum += 5;
            if (sum >= wellDepth)
                break;
            sum -= 3.5;
            day ++;
        }
        System.out.print("蜗牛需要 " + day +"  天才能从井底到爬出来。");
        
        input.close();
    }
}
