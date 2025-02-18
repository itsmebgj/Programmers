package lv0;

import java.util.ArrayList;

class Solution55 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] result = new int[intStrs.length];

        for(int i = 0; i < intStrs.length; i++){
            result[i] = Integer.parseInt(intStrs[i].substring(s, l));
            if(result[i] > k){
                answer.add(result[i]);
            }
        }

        int[] answerArr = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            answerArr[i] = answer.get(i);
        }
        return answerArr;
        
    }
}