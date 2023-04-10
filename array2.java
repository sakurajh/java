import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    //杨辉三角
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入n的数字:");
        int n = scan.nextInt();
        int array[][] = new int[n][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0 || j == array[i].length - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //判断数组有连续三个奇数
    public static boolean func4(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static void main9(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 2, 2, 2};
        System.out.println(func4(array));
    }

    //
    public int majorityElement(int[] array) {
        int ret = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ret) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ret = array[i + 1];
            }
        }
        return ret;
    }

    public static void main8(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 2, 2, 2};
    }

    public static int fun3(int[] array) {
        int ret = array[0];
        for (int i = 1; i < array.length; i++) {
            ret = ret ^ array[i];
        }
        return ret;
    }

    public static void main7(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        fun3(array);
        System.out.println(fun3(array));
    }

    public static void func1(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            while (i < j && array[i] % 2 != 0) {
                i++;
            }
            while (i < j && array[j] % 2 == 0) {
                j--;
            }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public static void main6(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        func1(array);
        System.out.println(Arrays.toString(array));

    }

    public static void transform(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void main5(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        transform(array);
        System.out.println(Arrays.toString(array));

    }

    public static void main4(String[] args) {
        //不规则的二维数组
        int[][] array1 = new int[2][];
        array1[0] = new int[3];
        array1[1] = new int[4];
    }

    public static void main3(String[] args) {
        int[][] array1 = new int[2][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] arr : array1) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
//        System.out.println();
//        System.out.println(Arrays.toString(array1));//地址
//        System.out.println(Arrays.deepToString(array1));//数组
    }

    public static void main2(String[] args) {
        //定义二维数组
        int[][] array1 = new int[2][3];
        int[][] array2 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] array3 = {{1, 2, 3}, {4, 5, 6}};
    }

    //冒泡排序法
    public static void bubbleSort(int[] array) {
        //i控制趟数
        for (int i = 0; i < array.length - 1; i++) {
            //优化：检查一躺之后，是否有序了？
            int flg = 1;
            //array.lengh-1-i 优化的是  每一趟比较的次数
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = -1;
                }
            }
            if (flg == 1) {
                return;
            }
        }
    }

    public static void main1(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        bubbleSort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
