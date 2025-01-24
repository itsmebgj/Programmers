package lv0;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //밑변
        int c = sc.nextInt(); //빗변

        int b_square = c*c - a*a; //^는 XOR연산이니까 사용금지, (int)Math.pow()사용 가능-> double 반환해서 int캐스팅, Math.sqrt()는 제곱근 

        System.out.println(b_square);
    }
}