class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // if문을 사용해서 먼저 두 배열의 길이를 비교
        // 길이가 같을 경우
        // 원소합을 구해서 비교 -> 합이 큰 경우, 같은 경우
        // 배열의 길이를 변수로 저장, 원소합을 계산할 변수 생성
        // arr1 크면 1, arr2 -1, 같으면 0

        int firLen = arr1.length;
        int secLen = arr2.length;
        int sum1 = 0;
        int sum2 = 0;

        if(firLen != secLen){
            return firLen > secLen ? 1 : -1;
        } else{
            for(int i = 0 ; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1 == sum2){
                return 0;
            } else {
                return sum1 > sum2 ? 1 : -1;
            }
        }
    }
}