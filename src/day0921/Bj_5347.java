package day0921;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj_5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int temp = num1;
            int mul = 2;
            while(temp % num2 != 0) {
                temp = num1 * mul;
                mul++;
            }
            System.out.println(temp);
        }
//        bw.flush();
//        bw.close();
    }
}
