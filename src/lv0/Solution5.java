package lv0;

class Solution5 {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<cpr.length; i++){ //cpr배열의 각 요소 순회, i는 cpr의 인덱스
            for(int j=0; j<basic_order.length; j++){ //basic_order배열의 각 요소 순회, j는 basic_order의 인덱스
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j+1; //answer배열의 i번째 요소에 j+1 저장(0부터 시작하는 인덱스를 1부터 시작하는 인덱스로 변환)
                    break;
                }
            }
        }
        return answer;
    } 
}