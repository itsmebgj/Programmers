package lv0;

class Solution46 {
    public int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = n;
        for(int i = 0; i < n; i++){
            
            if(n % 2 == 0){
            answer[i + 1] = n % 2;
        }else if(n % 2 != 0){
            answer[i+1]  + 1;
        }

            if(n == 1){
                
                break;
            }
        }

        return answer;
    }
}