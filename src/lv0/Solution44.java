package lv0;

class Solution44 {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i < queries.length; i++) {
            int index0 = queries[i][0];
            int index1 = queries[i][1];

            int temp = arr[index0];
            arr[index0] = arr[index1];
            arr[index1] = temp;
        }
        return arr;
    }
}
