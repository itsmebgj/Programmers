package lv0;

class Solution35 {
    public int solution(String ineq, String eq, int n, int m) {
        String op = ineq + eq;
        if (op.equals("<=")) {
            return n <= m ? 1 : 0;
        } else if (op.equals(">=")) {
            return n >= m ? 1 : 0;
        } else if (op.equals("<!")) {
            return n < m ? 1 : 0;
        } else if (op.equals(">!")) {
            return n > m ? 1 : 0;
        } else {
            return 0;
        }
    }
}