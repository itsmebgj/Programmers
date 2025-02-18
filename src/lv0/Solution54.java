package lv0;

import java.util.ArrayList;
class Solution54 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        int i = 0;
        while(i < arr.length){
            if(stk.size() == 0){ //stk.isEmpty()
            stk.add(arr[i]);
            i++;
            }
            else if(stk.get(stk.size() - 1) < arr[i]){
                stk.add(arr[i]);
                i++;
            }
            else{
                stk.remove(stk.size() - 1);
            }
        }

        int[] stkResult = new int[stk.size()];
        for(int j = 0; j < stk.size(); j++){
            stkResult[j] = stk.get(j);
        }
        return stkResult;
    }
}
/*

 */