class Solution {
    public int solution(int chicken) {
        int answer = coupon(chicken);
        return answer;
    }
    
    public int coupon(int couponCnt) {
        int service = couponCnt / 10;
        int remain = couponCnt % 10;

        // 종료조건
        if(couponCnt < 10) {
            return 0;
        } 
        
        return service + coupon(service + remain);
    }
}