/*
如果一个整数只能被1和自己整除,就称这个数是素数。
    如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
    如果一个数字既是素数也是回文数,就称这个数是回文素数
    牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数。
    输入描述:
    输入包括一行,一行中有两个整数(1 ≤ L ≤ R ≤ 1000)
    输出描述:
    输出一个整数,表示区间内回文素数个数。
    示例1
    输入

    100 150
    输出

    2
    */
package lianxi0608;

import java.util.*;
public class Test0608{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int count=0;
        for(int i=L;i<=R;i++){
            if(isHuiWen(i)&&isSu(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isHuiWen(int num){
        String s=String.valueOf(num);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean isSu(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<num/2+1;i++){
            if(num % i== 0){
                return false;
            }
        }
        return true;
    }

}