package lv0;

class Solution38 {
    public int solution(int a, int b, int c) {
        int abc = a + b + c;
        int abc2 = (a*a + b*b + c*c);
        int abc3 = (a*a*a + b*b*b + c*c*c);

        if(a != b && b != c && c != a){
            return abc;
        }else if((a == b && b != c) || (b == c && c != a) || (a == c && a != b) ){
            return abc * abc2;
        }else
        return abc * abc2 * abc3;
    }

}
/*
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }

        return answer;
    }

    private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}
 */