class Solution {
    public int solution(String myString, String pat) {
        // myString - replace 사용해서 A -> B, B -> A로 바꿔줌
        // 문제점 - A를 B로 바꾼 다음에 B를 A로 바꾸려고 기존에 있던 B만 바뀌지 않음
        // 두 개를 바꿔줄 때는 temp
        // contains 사용해서 pat 있는지 확인 -> 있으면 1, 없으면 0

        myString = myString.replace("A", "C");
        myString = myString.replace("B", "A");
        myString = myString.replace("C", "B");

        return myString.contains(pat) ? 1 : 0;
    }
}