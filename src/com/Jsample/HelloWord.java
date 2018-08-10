package com.Jsample;
import java.util.Scanner;
import java.lang.String;

public class HelloWord {
    public static void main(String args[]){
        int i,j,x;
        Scanner input1 = new Scanner(System.in);
        int k= input1.nextInt();//输入整型数k
        Scanner input2=new Scanner(System.in);
        String a=input2.next();//输入字符数组a
        char t;
        for(i=0;i<a.length();){
            x=i; t=a.charAt(i);
            for(j=1;j<k;j++,x++)
            {
                if(a.charAt(x+1)!=t) break;//在连续k个内存在不相等的情况
            }
            if(j==k)
            {
                System.out.println(t);
                break;
            }
            else i=x+1;//从连续串的最后一个字符的下一个开始
        }
    }
}