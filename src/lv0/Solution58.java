package lv0;

class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        for(int i = 0; i < numbers.length; i++){
            result += numbers[i];
        }
        result /= numbers.length;
        return result;
    }
}
// result 의 각 요소 더해서 numbers.length로 나누기