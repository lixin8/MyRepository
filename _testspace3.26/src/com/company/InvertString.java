package com.company;

import java.util.Scanner;
//将一句话里的单词进行倒置，标点符号不倒换。
//比如将“I come from Shanghai.”倒换后变为“Shanghai. from come I”
public class InvertString {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String inStr=input.nextLine();
        String[]strList=inStr.split(" ");
        String returnStr="";
        for (int i=0; i<strList.length; i++){
            returnStr=returnStr+strList[strList.length-1-i]+" ";
        }
        returnStr=returnStr.trim();
        System.out.println(returnStr);
    }
}
