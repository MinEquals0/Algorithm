class Solution {
    public int solution(int[] box, int n) {
        // 박스에서 n이 가질 수 있는 최대값의 곱
        int wid = box[0] / n;
        int hei = box[1] / n;
        int dep = box[2] / n;
        int answer = wid * hei * dep;
        return answer;
    }
}