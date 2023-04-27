package String;

import java.util.Scanner;

public class Test2 {
    //求第一个出现一次的数的下标
//    public int firstUniqChar(String s) {
//        int []count=new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char ch=s.charAt(i);
//            count[ch-'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch=s.charAt(i);
//            if(count[ch-'a']==1){
//                return 1;
//        }
//            return -1;
//    }
    //判断回文数
    public boolean ifEffective(char ch){
        if((ch>'a'&&ch<='z')||(ch>='0'&&ch<='9')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s){
        // 将大小写统一起来
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while(left<right) {
            // 1. 从左侧找到一个有效的字符
            while(left<right&&ifEffective(s.charAt(left))){
                left++;
            }
            // 2. 从右侧找一个有效的字符
            while(left<right&&ifEffective(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
    public static void main1(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ret = str.split(" ");
        System.out.println(ret[ret.length - 1].length());

    }
}
