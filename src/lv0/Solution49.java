package lv0;

class Solution49 {
    public int solution(int a, int b, int c, int d) {
        //네 주사위가 모두 같음
        if(a == b && b == c && c == d){
            return 1111 * a;
        }
        
        //네 주사위가 모두 다름
        if(a != b && a != c && a != d && b != c && b != d && c != d){
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
        
        //세 주사위가 같음
        //d가 다름
        if(a == b && b == c && d != a){
            return (10*a+d) * (10*a+d);
        }
        //a가 다름
        if(b == c && c == d && a != b){
            return (10*b+a) * (10*b+a);
        }
        //b가 다름
        if(c == d && d == a && b != a){
            return (10*a+b) * (10*a+b);
        }
        //c가 다름
        if(d == a && a == b && c != a){
            return (10*a+c) * (10*a+c);
        }

        //두 개씩 같음
        //a,b가 같고 c,d가 같음
        if(a == b && c == d && a != c){
            return (a+c) * Math.abs(a-c);
        }
        //a,c가 같고 b,d가 같음
        if(a == c && b == d && a != b){
            return (a+b) * Math.abs(a-b);
        }
        //a,d가 같고 b,c가 같음
        if(a == d && b == c && a != b){
            return (a+b) * Math.abs(a-b);
        }
        
        //한쌍이 같고 나머지는 다름
        //a,b가 같음
        if(a == b && c != d && a != c && a != d){
            return c * d;
        }
        //a,c가 같음
        if(a == c && b != d && a != b && a != d){
            return b * d;
        }
        //a,d가 같음
        if(a == d && b != c && a != b && a != c){
            return b * c;
        }
        //b,c가 같음
        if(b == c && a != d && b != a && b != d){
            return a * d;
        }
        //b,d가 같음
        if(b == d && a != c && b != a && b != c){
            return a * c;
        }
        //c,d가 같음
        if(c == d && a != b && c != a && c != b){
            return a * b;
        }
        
        return 0;
    }
}
/*
class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a == b && b==c && c==d) {
            return 1111 * a;
        }
        if(a==b && b==c) {
            return triple(a,d);
        }
        if(a==b && b==d){
            return triple(a,c);
        }
        if(b==c && c==d) {
            return triple(b,a);
        }
        if(a==c && c==d) {
            return triple(a,b);
        }
        if(a==b && c==d) {
            return double1(a,c);
        }
        if(a==c && b==d) {
            return double1(a,b);
        }
        if(a==d && b==c) {
            return double1(a,b);
        }
        if(a==b) 
            return double2(c,d);
        if(a==c)
            return double2(b,d);
        if(a==d)
            return double2(b,c);
        if(b==c)
            return double2(a,d);
        if(b==d)
            return double2(a,c);
        if(c==d)
            return double2(a,b);
        return Math.min(Math.min(a,b), Math.min(c,d));
    }

    private int double2(int q, int r) {
        return q * r;
    }

    private int double1(int p, int q) {
        return (p+q) * Math.abs(p-q);
    }

    private int triple(int p, int q) {
        return (10 * p + q) * (10 * p + q);
    }

}
 */