class Solution {
    public int solution(int[] date1, int[] date2) {
        // for 문으로 data1을 돌면서 if문으로 어느쪽이 작은지 확인 - 작은수가 있으면 리턴
        // 같은 경우 - 두번째 요소 -> 작은 수 리턴
        // 같은 경우 - 세번째 요소 -> 리턴
        // 세번째 요소까지 같으면 0을 리턴

        if(date1[0] < date2[0]){
            return 1;
        } else if (date1[0] == date2[0]){
            if(date1[1] < date2[1]){
                return 1;
            } else if(date1[1] == date2[1]){
                if(date1[2] < date2[2]){
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }

        } else {
            return 0;
        }
    }
}