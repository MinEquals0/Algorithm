class Solution {
    public String[] solution(String my_str, int n) {
        // for문으로 my_str 순회, 범위 i += 5
        // String[] 생성 - 길이 : 문자열 길이 / 6
        // 만들어진 문자열을 String[] 저장

        int len = (int) Math.ceil(((double)my_str.length())/n); // 정수/정수 
        String[] arr = new String[len];
        int idx = 0;

        for(int i = 0; i < my_str.length(); i += n){
            if((i+n) <= my_str.length()){ // 문자열 길이랑 같을 때도 실행
                arr[idx++] = my_str.substring(i, i+n);
            } else {
                arr[idx] = my_str.substring(i,my_str.length());
            }
        }
        return arr;
    }
}