package lv0;

class Solution36 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        switch (String.valueOf(flag)) {
            case "true":
            answer = a+b;
                break;
            case "false":
            answer = a-b;
            default:
                break;
        }
        return answer;
    }
}