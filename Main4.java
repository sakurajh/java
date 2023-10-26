package com.baidou;

public static void main(String[] args) {
    String str;
    while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        str = sc.next();

        boolean flag = checkStr(str);
        if (flag) {
            break;
        } else {
            System.out.println("当前输入的字符格式不正确，请重新输入！");
        }
    }

    StringJoiner sj = new StringJoiner(",");
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        int number = c - 48;

        sj.add(changeLuoMa(number));
    }
    System.out.println(sj);
}

//校验字符串是否满足要求
public static boolean checkStr(String str) {
    if (str.length() > 9) {
        return false;
    }
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}

//将输入的阿拉伯数字转换成罗马数字
public static String changeLuoMa(int number) {
    String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
    return arr[number];
}
