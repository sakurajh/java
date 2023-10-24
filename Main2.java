package com.baidou.test;

import java.util.Scanner; 

public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int coins[] = new int[n];
    for(int i = 0;i < n;i++)
    coins[i] = sc.nextInt();
    int amount = sc.nextInt();
    Solution s = new Solution();
    s.changecoins(coins, amount);
    System.out.print(s.flag<0?s.flag:s.Number);
    }
}
class Solution {
int number;
int Number;
int flag;
int memo[];
Solution()
{
  number = -1;
  Number = Integer.MAX_VALUE;
  flag = -1;
  memo = new int[100];
}
public void changecoins(int a[], int amount)
{ 
  number++;
  if(amount == 0)
  {
	flag++;
	Number = Math.min(Number, number);  
	return;
  }
  int xx;
  for(int i = 0;i < a.length;i++)
  {
	xx = amount - a[i];
	if(xx >= 0)
    {
	  changecoins(a, xx);
	  number--;
	}
  }
}
}