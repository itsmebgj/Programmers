package lv0;

import java.util.ArrayList;

class Solution50 {
    public String solution(String my_string, int[] index_list) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < index_list.length; i++) {
            list.add(my_string.charAt(index_list[i]));
        }

        String answer = "";

        for(int i = 0; i < list.size(); i++){
             answer += list.get(i);
        }

        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i = 0; i < index_list.length; i ++){
            answer += my_string.charAt(index_list[i]);
        }

        return answer;
    }
}
 */