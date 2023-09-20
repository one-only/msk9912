package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Bj_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        TreeSet<Integer> Nset = new TreeSet<>();
        for (int i = 2; i <= N; i++) {
            Nset.add(i);
        }
        int start = 2;
        int num = 2;
        int multi = 1;
        for (int i = 0; i < K - 1; i++) {
            Nset.remove(num);
            while (!Nset.contains(num)) {
                multi++;
                num = start * multi;
                if (num > N) {
                    start++;
                    multi = 1;
                    num = start * multi;
                }
            }
        }
        System.out.println(num);
    }
}
