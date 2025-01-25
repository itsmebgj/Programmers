package lv0;

class Solution27 {
    public String solution(String str1, String str2) {
        String answer = "";

    /*  int length = str1.length();
        char[] result = new char[2*length];

        for(int i = 0; i < length; i++){
            result[i * 2] = str1.charAt(i);//짝
            result[i * 2 + 1] = str2.charAt(i);//홀            
        }
        answer = new String(result);
     */
        for(int i = 0; i < str1.length(); i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }   
}