package lv0;

class Solution45 {
    public int[] solution(int start_num, int end_num) {
        int length = end_num - start_num + 1;
        int[] answer = new int[length];
        //int[] answer = {} 는 길이가 0인 배열 생성

        for(int i = 0; i < length; i++){
            answer[i] = start_num;
            start_num++;            
        }

        return answer;
    }
}