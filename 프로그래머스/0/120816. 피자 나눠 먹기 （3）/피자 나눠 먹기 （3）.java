class Solution {
    public int solution(int slice, int n) {
        int result = 0;
        if(n % slice == 0) {
           result = n/slice;
        } else {
            result = n/slice + 1;
        }

        return result;
        // return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
