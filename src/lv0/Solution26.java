package lv0;

class Solution26 {
    public String solution(String my_string, String overwrite_string, int s) {

        String first = my_string.substring(0, s);
        String last = my_string.substring(s + overwrite_string.length());
        String answer = first + overwrite_string + last;
        
        return answer;
    }
}