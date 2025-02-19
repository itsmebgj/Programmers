package lv0;

class Solution60 {
    public int solution(int n) {
        int result = 0;
        int slice = 6;
        while(slice % n != 0){
            result++;
            slice += 6;
        }result++;
        return result;
    }
}
// n: 사람수 / 한판에 6조각 / 모두 같은 수의 조각을 먹어야함
// 