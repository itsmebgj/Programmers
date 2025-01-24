package lv0;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<1; i++){
            answer += number % 100; // answer = answer + number % 100 , number의 뒷 두자리
            number /= 100; // number = number / 100, number의 앞 두자리
        }   

        System.out.println(answer);
    }
}