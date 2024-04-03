import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 받기
        int n = Integer.parseInt(br.readLine());

        People[] arr = new People[n];

        for(int i = 0; i < arr.length; i++){
            String[] str = br.readLine().split(" ");
            arr[i] = new People(Integer.parseInt(str[0]), str[1]); // 객체를 생성해서 배열에 저장
        }

        // 정렬 - 나이 오름차순, 같은 나이일 때 가입순서(따로 조건을 지정하지 않아도 됐음, 입력순서 = 가입순서)
        Arrays.sort(arr, Comparator.comparingInt(a -> a.age));

        // 출력
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i].age + " " + arr[i].name).append("\n");
        }
        System.out.println(sb);
    }
}

class People {
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
}