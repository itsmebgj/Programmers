package lv0;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.printf("%d is even", n);
        }else{
            System.out.printf("%d is odd", n);
        }
    }
}