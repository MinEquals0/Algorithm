class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
                return 0;
            }
        
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return i;
            }

            // 문자열을 오른쪽으로 한 칸 미는 코드
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
        }

            return -1;
       
    }
}