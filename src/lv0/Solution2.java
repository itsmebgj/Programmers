package lv0;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle%360);
    }
}
//angle1과 angle2의 합은 765도이고, 765를 720을 빼면 45도이므로 45를 출력합니다.