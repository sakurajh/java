import javax.sound.sampled.Line;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

//        byte 0
//        short 0
//        int 0
//        long 0
//        float 0.0f
//        double 0.0
//        char /u0000
//        boolean false
//数组的对象是在堆上的‘
//引用变量目前是在main函数里面的，它属于局部变量，当函数结束后就会被回收内存
//对象的回收是没人引用它
//Arrays:操作数组相关的工具类.
public class array {
    public static void main(String[] args) {
        int []array =new int [10];
        //全部初始化为2,还可以部分初始化
        Arrays.fill(array,2,5,2);
        System.out.println(Arrays.toString(array));
//        int []array2 ={1,2,3,4,56,7};
//        boolean flg=Arrays.equals(array,array2);
//        System.out.println(flg);
    }
    //数组拷贝
    public  static  double avg(int []array){
        int sum=0;
        for (int x:array) {
            sum+=x;
        }
        return sum*1.0/array.length;
    }
    public static int find(int[]array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    //二分查找
    //建立在有序的数组下
    public static  int binarySearch(int []array,int key){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid =(left+right)>>>1;
            if(array[mid]<key){
                left=mid+1;
            } else if (array[mid]>key) {
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //逆序数组的数
    public  static void nx(int[]array){
        int left=0;
        int right= array.length-1;
        while(left<right){
            for (int i = 0; i < array.length>>>1; i++) {
                int tmp=array[left];
                array[left]=array[right];
                array[right]=tmp;
                left++;
                right--;
            }
        }
    }
    public static void main15(String[] args) {
        int []array ={1,2,3,4,56,7};
        nx(array);
        System.out.println(Arrays.toString(array));
        //数组排序函数,不是冒泡排序;
       // Arrays.sort(array);

        //int index=binarySearch(array,3);
        //Arrays自带的二分查找
        //int index=Arrays.binarySearch(array,6);
        //System.out.println(index);
//        System.out.println(avg(array));
//        System.out.println(find(array, 4));

    }
    public static void main14(String[] args) {
        int []array ={1,2,3,4,56,7};
        int []array2=array.clone();//产生一个副本
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void main13(String[] args) {
        int []array ={1,2,3,4,56,7};
        int [] array2=Arrays.copyOfRange(array,2,5);//[2,5)左闭右开
    }
    public static void main12(String[] args) {
        int []array ={1,2,3,4,56,7};
        int [] copy=new int [array.length];
        //支持局部拷贝
        System.arraycopy(array,0,copy,3,array.length-3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
    }
    public static void main11(String[] args) {
        int []array={1,3,5,7,9};
        int []array2=Arrays.copyOf(array,2*array.length);
        System.out.println(Arrays.toString(array2));
    }
    public static void main10(String[] args) {
        int []array={1,3,5,7,9};
        int [] array2=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i]=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    //数组转字符串
    public  static String mytoString(int [] tmp){
        if(tmp==null){
            return "null";
        }
        String ret ="[";
        for (int i = 0; i < tmp.length; i++) {
            ret=ret+tmp[i];
            if(i!= tmp.length-1){
                ret+=",";
            }
        }
        ret=ret+"]";
        return ret;
    }
    public static void main9(String[] args) {
        int [] array={1,2,3,4};
        String set =mytoString(array);
        System.out.println(set);
    }
    public static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }

    public static void main8(String[] args) {
        int[] tmp = {1, 2};
        System.out.println("交换前" + tmp[0] + " " + tmp[1]);
        swap(tmp);
        System.out.println("交换后" + tmp[0] + " " + tmp[1]);
    }

    public static int[] func3() {
        int[] tmp = {1, 2, 3, 4, 5, 6, 7};
        return tmp;
    }

    public static void main7(String[] args) {
        int[] ret = func3();
        System.out.println(Arrays.toString(ret));
    }

    public static void func1(int[] array) {
        array = new int[10];
    }

    public static void func2(int[] array) {
        array[0] = 99;
    }

    public static void main6(String[] args) {
        int[] array = {1, 2, 3, 4};
        func1(array);
        System.out.println(Arrays.toString(array));
        func2(array);
        System.out.println(Arrays.toString(array));

    }

    public static void main5(String[] args) {
        int[] array = null;//代表这个引用不指向任何一个对象
        System.out.println(array);
    }

    public static void main4(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        //array2这个引用 指向了array这个引用所引用的对象
        int[] array2 = array;
        array2[1] = 99;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }

    public static void main3(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //数组当中数据的类型定义的变量 : 数组名  for each 增强for循环
        //区别：拿不到数组下标
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        //把数组转变成字符串，然后返回
        String ret = Arrays.toString(array);
        System.out.println(ret);

    }

    public static void main1(String[] args) {
        int[] array = {1, 2, 3};//直接赋值   静态初始化
        //            net  type[]  {dates}
        int[] array2 = new int[]{1, 2, 3, 4};//动态初始化
        //没有本质的区别，只有写法的区别
        int[] array4 = new int[10];//只是分配了内存，但是没有进行赋值 只有默认值0

        float[] array3 = {1.0f, 2.5f};
        int ret = array[2];
        System.out.println(ret);
        int len = array.length;//数组名。长度求数组长度.
        System.out.println(len);
    }
}
