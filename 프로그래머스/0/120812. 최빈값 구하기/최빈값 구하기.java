class Solution {
    public int solution(int[] array) {
        int[] cntArr = new int[1000];
        
        // 빈도수 세기
        for(int i : array){
            cntArr[i]++;
        }
        
        int max = 0;
        
        // 최대 빈도수 찾기
        for(int i : cntArr){
            if(max < i){
                max = i;
            }
        } 
        
        // 최빈값 구하기
        int maxCnt = 0;
        int answer  = 0;          
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == max) {
                maxCnt++;
                answer = i;      
            }
        }
        
        return (maxCnt > 1) ? -1 : answer;

        /*
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }

        return answer;
        */
    }
}
