package com.company;

import java.util.Scanner;
//对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
//如果 X = 123，则rev(X) = 321;
//如果 X = 100，则rev(X) = 1.
//现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
public class Digitalfilp {

    public static void main(String[] args) {
	    System.out.print("测试类~~~");
        Scanner inputNo=new Scanner(System.in);
        int x=inputNo.nextInt();
        int y=inputNo.nextInt();
        System.out.print("输出结果：rev(rev(x)+rev(y))="+rev(rev(x)+rev(y)));
    }

    private static int rev(int x){
        StringBuffer str=new StringBuffer(String.valueOf(x));
        str.reverse();
        return Integer.valueOf(str.toString());
    }
}
