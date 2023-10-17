package com.baidou.test;
import java.util.Arrays;
import java.util.Scanner;

public class text1 {
	class Season{
		public int month;
		
		void jment(int month){
			if(month>=3&&month<=5) {
				System.out.println("春季");	
			}else if(month>=6&&month<=8) {
				System.out.println("夏季");
			}else if(month>=9&&month<=11) {
				System.out.println("秋季");
			}else if(month==12&&month==1&&month==2) {
				System.out.println("冬季");
			}
		}
	}
	 static class Calculator{
	        public int a;
	        public int b;


	        int add(){
	            return a+b;
	        }
	        int sub(){
	            return a-b;
	        }
	        int mul(){
	            return a*b;
	        }
	        int div(){
	            if(b!=0){
	                return a/b;
	            }else{
	                System.out.println("除数不能为0,请重新输入一组数据!!!");
	                return 0;
	            }
	        }
	public static void main(String []args) {
		 System.out.println("输入两个数进行计算:");
	        Scanner reader=new Scanner(System.in);
	        int num1= reader.nextInt();
	        int num2= reader.nextInt();
	        reader.close();
	        Calculator CalculatorTest=new Calculator();
	        CalculatorTest.a=num1;
	        CalculatorTest.b=num2;
	        int sum=CalculatorTest.add();
	        int sub=CalculatorTest.sub();
	        int mul=CalculatorTest.mul();
	        int div=CalculatorTest.div();
	        System.out.println("和为:"+sum);
	}
	public static void main13(String []args) {
		text1.Season obj = new text1().new Season();
		obj.jment(9);
	}
	
	public static void main12(String []args) {
		  System.out.println("请输入一个24小时制时间:时:分");
		    Scanner input=new Scanner(System.in);
		    int h = input.nextInt();
		    int s= input.nextInt();
		    if(h>=0&&h<24&&s>=0&&s<60){
		        if(h>12){
		            h-=12;
		        }
		    System.out.println("转换后的时间为:"+h+":"+s);
		    }else{
		        System.out.println("输入的时间不合法！");
		    }

	}
	//数组逆序
	public static void main11(String[]args) {
		int []arr= {1,2,3,4};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void reverse(int []arr) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int tmp=arr[left];
			arr[left]=arr[right];
			arr[right]=tmp;
			
			left++;
			right--;
		}
	}
	
	//java内置的排序方法
	public static void main10(String[]args) {
		int []arr= {9,5,2,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//冒泡排序
	public static void main9(String[]args) {
		int []arr= {9,5,2,7};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	
	//二分查找
	public static void main8(String[]args) {
		int []arr= {1,2,3,4,5,6};
		System.out.println(binarySearch(arr,6));
	}
	public static int binarySearch(int []arr,int toFind) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(toFind<arr[mid]) {
				right=mid-1;
				
			}else if(toFind>arr[mid]) {
				left=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main7(String[]args) {
		int arr[]= {1,2,3,10,5,6};
		System.out.println(find(arr,10));
		
	}
	//顺序查找数组元素
	public static int find(int []arr,int data) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data)
			return i;
		}
		return -1;
	}
	
	
	//求数组元素的平均值
	public static void main6(String[]args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(avg(arr));
	}
	
	public static double avg(int []arr) {
		int sum=0;
		for(int x:arr) {
			sum+=x;
		}
		return (double)sum/(double)arr.length;
	}
	
	
	//数组的拷贝
	public static void main5(String[]args) {
		// newArr和arr引用的是同一个数组
		// 因此newArr修改空间中内容之后，arr也可以看到修改的结果
		int []arr= {1,2,3,4,5,6};
		int []newArr=arr;
		newArr[0]=10;
		System.out.println("newArr:"+Arrays.toString(arr));
		
		// 使用Arrays中copyOf方法完成数组的拷贝：
		// copyOf方法在进行数组拷贝时，创建了一个新的数组
		// arr和newArr引用的不是同一个数组
		arr[0]=1;
		newArr=Arrays.copyOf(arr, arr.length);
		System.out.println("newArr: " + Arrays.toString(newArr));

		// 因为arr修改其引用数组中内容时，对newArr没有任何影响
		arr[0]=10;
		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("newArr: " + Arrays.toString(newArr));
	
		// 拷贝某个范
		int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println("newArr2: " + Arrays.toString(newArr2));
	}
	//Array的使用
	public static void main4(String[]args) {
		int [] array={10,20,30,40,50};
		String newArr=Arrays.toString(array);
		System.out.println(newArr);
	}
	
	//数组
	public static void main3(String[]args) {
		int [] array={10,20,30,40,50};
		//for each循环遍历
		for(int x:array) {
			System.out.println(x);
		}
	}
	
	public static int add(int x,int y) {
		return x+y;
	}
	public static double add(double x,double y) {
		return x+y;
	}
	public static double add(double x,double y,double z) {
		return x+y+z;
	}
	public static void main2(String[]args) {
		System.out.println(add(5,6)); // 调用add(int, int)
		System.out.println(add(1.5,2.5)); // 调用add(double, double)
		System.out.println(add(1.5,2.5,3.5)); // 调用add(double, double, double)
	}
	//函数的加法
//	public static int add(int x,int y){
//		return x+y;
//	}
	public static void main1(String[]args) {
		System.out.println(add(5,6));
	}
}
