package com.baidou;
/*
 * 1-2-1 Milking Cows 挤牛奶
时间限制：1.000s 内存限制：128MB
题目
三个农民每天清晨5点起床，然后去牛棚给3头牛挤奶。
第一个农民在300秒(从5点开始计时)给他的牛挤奶，一直到1000秒。
第二个农民在700秒开始，在 1200秒结束。第三个农民在1500秒开始2100秒结束。
期间最长的至少有一个农民在挤奶的连续时间为900秒(从300秒到1200秒)，
而最长的无人挤奶的连续时间(从挤奶开始一直到挤奶结束)为300秒(从1200秒到1500秒)。

你的任务是编一个程序，读入一个有N个农民(1 <= N <= 5000)挤N头牛的工作时间列表，
计算以下两点(均以秒为单位):

最长至少有一人在挤奶的时间段。
最长的无人挤奶的时间段。（从有人挤奶开始算起）
 */
import java.util.*;

public class Test11{
    public static int N = 5010;
    public static int n;
    public static int a, b;
    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 0; i < n; i ++ ){
            a = scanner.nextInt();b = scanner.nextInt();
            map.put(a, b);
        }
        // 对map的key进行排序(左端点)
        List<Map.Entry<Integer,Integer>> listOfMap = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());// 取出集合再化为列表
        Collections.sort(listOfMap, new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }

        });
//        System.out.println(listOfMap);
        Map.Entry<Integer,Integer> first = listOfMap.stream().findFirst().orElse( null );
//        System.out.println(first);
        // 贪心
        int res1 = 0, res2 = 0;
        int l = first.getKey(), r = first.getValue();
        for(Map.Entry<Integer,Integer> item:listOfMap){
            if(item.getKey() <= r) r = Math.max(r, item.getValue());
            else{
                res1 = Math.max(res1, r - l);
                res2 = Math.max(res2, item.getKey() - r);
                l = item.getKey();
                r = item.getValue();
            }
        }
        res1 = Math.max(res1, r - l); // 最后一段别漏了
        System.out.println(res1 + " " + res2);
    }
}

