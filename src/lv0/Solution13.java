package lv0;

class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2]; //[0,0]
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;  //[east, 0]
        answer[1] = north; //[east, north]
        return answer;
    }
}