package lv0;

class Solution7 {
    public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i]);
        }
        int answer = func1(seat - num_passenger); //1. seat - num_passenger : 남아있는 좌석 수, func1 호출 
        return answer;  // 3. 반환된 값 answer출력(남은 좌석 수)
    }

    public int func1(int num){ // 2. num이 0보다 작으면 0을 반환, 아니면 num을 반환
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}