package lv0;

class Solution39 {
    public int solution(int[] num_list) {
        int multiple = 1;
        int sum = 0;

        for(int i = 0; i < num_list.length; i++){
            multiple *= num_list[i];
            sum += num_list[i]; 
        }
        return sum*sum > multiple ? 1 : 0;
    }
}