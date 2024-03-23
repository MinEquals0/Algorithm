class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (i == 0 && ch == '1') {
                mode = !mode;
                continue;
            }

            if (ch == '1') {
                mode = !mode;
                continue;
            }

            if ((mode == false && i % 2 == 0) || (mode == true && i % 2 == 1)) {
                answer.append(ch);
            }
        }

        if (answer.length() == 0) {
            return "EMPTY";
        }

        return answer.toString();
    }
}
