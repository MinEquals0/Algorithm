import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int youngest = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        int gap = second - youngest;

        System.out.println(second + gap);
    }
}
