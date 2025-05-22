class Solution {
    public int solution(int M, int N) {
        // M, N이 1이 되도록 자르려면,
        // (M-1) + {(N-1) * M} => MN -1
        return M * N - 1;
        
        // int row = M - 1;
        // int col = (N-1) * M;
        
        // int answer = row + col;
        // return answer;
        
    }
}
