package lv0;

class Solutino51 {
    public int solution(String number) {
        int num = 0;
        for(int i = 0; i < number.length(); i++){
            num += Integer.parseInt(number.substring(i, i+1)); //i이상 i+1미만 -> i번째 문자열
        }
        return (int)num % 9;
    }
}