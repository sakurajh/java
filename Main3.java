package com.baidou;

/**猴子选大王*/
public class Main {
	public static void main(String[] args) {
		//1.定义长度为15的数组保存猴子,boolean类型是为了判断猴子是否存活
		boolean[] b=new boolean[15];

		//2.依次遍历每一只猴子
		//true---未淘汰  false---已淘汰
		for(int i=0;i<b.length;i++){
			b[i]=true;//先把所有猴子设置成存活
		}
		//3.定义变量保存猴子报的数
		int num=0;
		//4.定义变量保存剩余的猴子数
		int monkeyLeft=15;
		//5.定义数组下标
		int index=0;
		//6.循环,直到只剩最后一只猴子(猴子王)
		while(monkeyLeft>1){//判断条件
			//7.检测猴子是否已淘汰
			if(b[index]){
				//8.报数
				num++;
				//9.判断报数是否为7
				if(num==7){
					b[index]=false;//为7淘汰
					monkeyLeft--;//猴子数减一
					num=0;//报数归零
				}

			}

			//10.下标移动
			index++;
			//11.围成一圈---最后一个置为0
			if(index==15){
				index=0;
			}
		}

		//遍历数组,找到最后活着的那个猴子王
		for(int i=0;i<b.length;i++){
			if(b[i]){
				System.out.println(i+1);
			}
		}
	}
}
