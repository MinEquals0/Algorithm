// 재귀로 푸는 경우
class Solution {
    public int solution(int chicken) {
        // chicken을 10으로 나눴을 때 몫 
        // + 서비스 치킨 개수를 다시 10으로 나눈 몫 + 반복 리턴
        // 계속 해서 나눌 수 있는 방법은 뭘까? 재귀함수
        // 주의할 점 : 몫을 뺀 나머지 쿠폰을 모아서 서비스 치킨 시킬 수 있음
        int answer = coupon(chicken);
        return answer;
    }

    // 재귀 함수
    public int coupon(int couponCnt) {
        // 치킨 개수가 들어오면 10으로 나눈 몫을 누적으로 저장해야돼
        // 나머지 쿠폰 처리 로직 필요
        int service = couponCnt / 10;
        int remain = couponCnt % 10;

        if(couponCnt < 10) {
            return 0;
        } // 종료조건
        
        return service + coupon(service + remain);
    }
}

// 단순 반복문으로 푸는 경우
/*
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10){
            int service = chicken / 10;
            int nmg = chicken %  10;

            chicken = service + nmg;
            answer += service;
        }
        return answer;
    }
}
*/
