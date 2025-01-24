package lv0;

class Solution6 {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0; //총 물 사용량

        for(int i=0; i<change.length; i++){ //change배열의 각 요소 순회, i는 change의 인덱스
            usage += usage * change[i] / 100; //지난달 물 사용량
            total_usage += usage; //total_usage = total_usage + usage, 총 물 사용량
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}