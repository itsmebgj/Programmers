package lv0;

class Solution26 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(i == s){
                answer += overwrite_string.substring(0);
            }else{
                answer += my_string.substring(0, i);
            }
        }
        return answer;
    }
}