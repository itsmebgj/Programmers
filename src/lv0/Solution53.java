package lv0;

import java.util.ArrayList;
class Solution53 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            if(isFive(i)){
                result.add(i);
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }if(answer.length == 0){
            return new int[]{-1};
        }
        return answer;
    }

    private static boolean isFive(int num){
        while(num > 0){
            if(num % 10 != 5 && num % 10 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }    
}
// 5, 500 > 5 50 55 500 505 550 555 > 0과 5로만 이루어진 수 오름차순