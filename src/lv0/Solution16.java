package lv0;

class Solution16 {
    public String solution(String[] storage, int[] num) {
        int num_item = 0; //item 개수
        String[] clean_storage = new String[storage.length]; 
        int[] clean_num = new int[num.length];
        
        for(int i=0; i<storage.length; i++){ //storage의 각 요소 순회, i는 storage의 인덱스
            int clean_idx = -1; //현재 항목이 clean_storage에 있는지 확인

            for(int j=0; j<num_item; j++){ //num_item의 각 요소 순회하며 clean_storage에 현재 항목이 있는지 확인
                if(storage[i].equals(clean_storage[j])){ //storage[i]와 clean_storage[j]가 같으면, 현재 항목이 clean_storage에 있음
                    clean_idx = j; //clean_idx에 j 저장 
                    break;
                }// 현재 항목이 이미 존재하면 중복된 항목이므로, clean_idx에 j 저장하고 break함. 이후에는 else문으로 넘어감
            }

            if(clean_idx == -1){ //clean_idx가 -1이면, 현재 항목이 clean_storage에 없음
                clean_storage[num_item] = storage[i]; //clean_storage[num_item]에 num[i] 저장, 현재 항목을 clean_storage에 추가
                clean_num[num_item] = num[i]; //clean_num[num_item]에 num[i] 저장, 현재 항목의 개수를 clean_num에 추가
                num_item += 1; // 현재 항목이 clean_storage에 없으면, clean_storage에 추가하고 num_item을 1 증가
            }

            else{
                clean_num[clean_idx] += num[i]; // clean_num[clean_idx]에 num[i] 더함, 현재 항목의 개수를 clean_num에 추가
            } // 현재 항목이 clean_storage에 있으면, clean_num에 개수만 추가 
        }
        
        // 아래 코드에는 틀린 부분이 없습니다.
        
        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}