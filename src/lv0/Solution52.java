package lv0;

class Solution52 {
    public String solution(String my_string, int[][] queries) {

        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            my_string = reverseString(my_string, s, e);
        }
        return my_string;
    }


    private String reverseString(String my_string, int s, int e){
        char[] charArray = my_string.toCharArray();
        
        while(s < e){
            char temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;
            s++;
            e--;
        }
        return new String(charArray);
    }
}