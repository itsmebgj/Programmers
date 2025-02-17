package lv0;

class Solution31
 {
    public int solution(int a, int b) {
        String ab = String.valueOf(a)+String.valueOf(b);

        if(Integer.valueOf(ab) < (2 * a * b)){
            return (2 * a * b);
        }else if(Integer.valueOf(ab) > (2 * a * b)){
            return Integer.valueOf(ab);
        }else
        return Integer.valueOf(ab);
    }
}