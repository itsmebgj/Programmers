package lv0;

class Solution37 {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;

        for(int i = 0; i < included.length; i++){
            if(included[i]){
                result += a + i * d;
            }
        }
        return result;
    }
}