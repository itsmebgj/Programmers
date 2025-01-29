package lv0;

class Solution34 {
    public int solution(int n) {
        int oddSum = 0;
        int evenSum = 0;
        
        if (n % 2 != 0){
            for(int i = 1; i <= n; i += 2){
                oddSum += i;
            }
            return oddSum;
        }else{
            for(int i = 0; i <= n; i += 2){
                evenSum += Math.pow(i, 2);
            }
            return evenSum;
        }
    }
}