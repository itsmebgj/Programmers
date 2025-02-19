package lv0;

class Solution57 {
    public int solution(int price) {
        if(price >= 100000 && price < 300000){
            price = (int)(price * 0.95);
        }else if(price >= 300000 && price < 500000){
            price = (int)(price * 0.9);
        }else if (price >= 500000 && price <= 1000000){
            price = (int)(price * 0.8);
        }
        return price;
    }
}
// 10이상: 5%, 30이상: 10%, 50이상: 20%할인