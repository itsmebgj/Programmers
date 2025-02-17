package lv0;

import java.util.ArrayList;

class Solution47 {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int minVal = findMinValue(arr, s, e, k);
            result.add(minVal);
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static int findMinValue(int[] arr, int s, int e, int k){
        int minValue = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = s; i <= e; i++){
            if(arr[i] > k && arr[i] < minValue){
                minValue = arr[i];
                found = true;
            }
        }
        return found ? minValue : -1;
    }
}


/*
      arr	                    queries             	  result
[0, 1, 2, 4, 3]	    [[0, 4, 2],[0, 3, 2],[0, 2, 2]]	    [3, 4, -1]
 */