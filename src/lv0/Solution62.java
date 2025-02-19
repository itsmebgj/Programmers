package lv0;

import java.util.ArrayList;


class Solution62 {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
  
        while(result.size() == 0 || n >= result.get(result.size() - 1)){
            if(result.size() == 0){
                result.add(1);
            }else{
            result.add(result.get(result.size() - 1) + 2);
            }
        }if(result.get(result.size() - 1) > n){
            result.remove(result.size() - 1);
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}