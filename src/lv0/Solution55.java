package lv0;

import java.util.ArrayList;

class Solution55 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < intStrs.length; i++){
            int value = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(value > k){
                answer.add(value);
            }
        }

        int[] answerArr = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            answerArr[i] = answer.get(i);
        }
        return answerArr;
    
    }
}