package lv0;

class Solution61 {
    public int solution(int n) {
        int result = 0;
        int slice = 7;

        if(n <= slice){
            result = 1;
        }else if(n > 7 && n % slice > 0){
            result = n / slice + 1;
        }else{
            result = n / slice;
        }
        return result;
    }
}