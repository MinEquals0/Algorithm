import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input1 = br.readLine();
        String input2 = br.readLine();

        // 두 입력을 char[]로 만들기
        char[] ch1 = input1.toCharArray();
        char[] ch2 = input2.toCharArray();

        // 알파벳을 저장할 새 배열 2개
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        // for문을 돌면서 각 char 배열에 있는 알파벳을 카운트
        for(int i = 0; i < ch1.length; i++){
            int x = ch1[i] - 'a';
            arr1[x]++;
        }

        for(int i = 0; i < ch2.length; i++){
            int y = ch2[i] - 'a';
            arr2[y]++;
        }

        // 두 배열에 저장된 알파벳 개수의 차이를 구함 -> 차이를 모두 더해줌
        // 배열의 길이가 같아 - 26
        int total = 0;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
               int num = Math.abs(arr1[i] - arr2[i]);
               total += num;
            }
        }
        System.out.println(total);
    }
}