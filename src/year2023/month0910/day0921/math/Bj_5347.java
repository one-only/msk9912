package year2023.month0910.day0921.math;

import java.io.*;
import java.util.StringTokenizer;
//bigInteger 한번쯤 알아두기
public class Bj_5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        long n = Integer.parseInt(st.nextToken());

        for (long i = 0; i < n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            long num1 = Integer.parseInt(st.nextToken());
            long num2 = Integer.parseInt(st.nextToken());
            long temp = num1;
            long mul = 2;
            while(temp % num2 != 0) {
                temp = num1 * mul;
                mul++;
            }
            System.out.println(temp);
        }
    }
}
