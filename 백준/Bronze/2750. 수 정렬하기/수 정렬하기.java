import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 받기
        int n = Integer.parseInt(br.readLine()); // 주어지는 숫자의 개수

        // 카운팅 정렬
        // 배열 생성 - 크기가 2001 -1000~1000 0
        int[] arr = new int[2001]; // 알파벳 문제랑 같은 경우

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            arr[x+1000]++; // x = -1000 인 경우에 arr[0]이 1이 됨
        }

        for(int j = 0; j < arr.length ; j++){
            if(arr[j] != 0){
                sb.append(j-1000).append("\n");
            }
        }

        System.out.println(sb); // sb.toString() 하지 않아도 프린트문이 알아서 바꿔줌

//        Arrays.sort(nums); // 메소드를 사용해서 풀 수도 있음
        
    }
}