package lv0;

class Solution48 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean part1 = x1 || x2;
        boolean part2 = x3 || x4;
        answer = part1 && part2;
        return answer;
    }
}

/*
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
x       y       x v y                     x ^ y
            둘중1개라도 참이면 참(OR)   둘다 참이면 참(AND)
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
T       T         T                         T
T       F         T                         F
F       T         T                         F
        F         F                         F   

 */