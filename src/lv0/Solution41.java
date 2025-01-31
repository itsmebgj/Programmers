package lv0;

import java.util.Arrays;

class Solution41 {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] tmp1_list = Arrays.copyOf(num_list, length+1);
        int[] tmp2_list = Arrays.copyOf(num_list, length+1);

        for(int i =0; i < length; i++){
            if(num_list[length-1] > num_list[length-2]){
                tmp1_list[length] = num_list[length-1] - num_list[length-2];
                return tmp1_list;
            }else{
                tmp2_list[length] = num_list[length-1] * 2;
            }
        }
        return tmp2_list;
    }
}