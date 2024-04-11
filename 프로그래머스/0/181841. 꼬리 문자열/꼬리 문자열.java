class Solution {
    public String solution(String[] str_list, String ex) {
        // String 배열을 for문으로 돌면서 ex 문자열을 포함하고 있는지 확인 - if문
        // 포함하고 있으면 건너띄고
        // 포함하지 않으면 StringBuilder에 추가

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                sb.append(str_list[i]);
            }
        }
        return sb.toString();
    }
}