package lv0;

class Solution30 {
    public int solution(int a, int b) {
/*
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        
        String result1 = sa + b;
        String result2 = sb + a;
        
        int compare1 = Integer.parseInt(result1);
        int compare2 = Integer.parseInt(result2);

        if(compare1 < compare2){
            return compare2;
        }else
            return compare1;
 */
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        return Math.max(Integer.valueOf(ab),Integer.valueOf(ba));
    }
}