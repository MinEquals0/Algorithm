import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr;

        while(n-- > 0){
            arr = br.readLine().split(" ");
            // 입력받은 arr 을 char 배열에 저장
            char[] ch1 = arr[0].toCharArray();
            char[] ch2 = arr[1].toCharArray();

            // 알파벳 배열을 두 개 만들어서 카운트
            int[] alph1 = new int[26];
            int[] alph2 = new int[26];

            for(char c : ch1){
                int x = c - 'a';
                alph1[x]++;
            }

            for(char c : ch2){
                int x = c - 'a';
                alph2[x]++;
            }

            boolean isPossible = true;

            // 두 배열이 같은지 확인 -> possi, impossi 출력
            for(int i = 0; i < alph1.length; i++){
                if(alph1[i] != alph2[i]){
                    isPossible = false;
                    break;  // 가장 가까운 for문을 멈춤
                }
            }
            sb.append(isPossible ? "Possible" : "Impossible").append("\n");
        }
        System.out.println(sb);
    }
}