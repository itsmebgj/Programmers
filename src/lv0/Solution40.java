package lv0;

class Solution40 {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += String.valueOf(num_list[i]);   //짝
            }else{
                odd += String.valueOf(num_list[i]);    //홀
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}