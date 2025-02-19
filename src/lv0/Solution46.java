package lv0;

import java.util.ArrayList;

class Solution46 {
    public int[] solution(int n) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(n);

        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = n * 3 + 1;
            }
                sequence.add(n);
        }

        int[] answer = new int[sequence.size()];
        for(int i = 0; i < sequence.size(); i++){
            answer[i] = sequence.get(i);
        }

        return answer;
    }
}