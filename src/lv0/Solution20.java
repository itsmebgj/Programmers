package lv0;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                answer += Character.toLowerCase(ch);
            }
            else{
                answer += Character.toUpperCase(ch);
            }
        }
        System.out.println(answer);
    }
}