import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);

        System.out.println(a + b);
    }
}