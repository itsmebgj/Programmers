package lv0;


class Solution41 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] tmp1_list = 

        int length = num_list.length;

        for(int i =0; i < length; i++){
            if(num_list[length-1] > num_list[length-2]){
                num_list[i] += num_list[length-1] - num_list[length-2];
            }else{

            }
        }

        return answer;
    }
}