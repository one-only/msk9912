package day0928.sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bj_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st;

        int T = Integer.parseInt(str);

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arrN = new int[N];
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            for (int j = 0; j < N; j++) {
                arrN[j] = Integer.parseInt(st.nextToken());
            }
            str = br.readLine();
            st = new StringTokenizer(str, " ");

            int result = 0;
//            Integer[] tmp = Arrays.stream(arrN).boxed().toArray(Integer[]::new);
//            Arrays.sort(tmp, Comparator.reverseOrder());
            Arrays.sort(arrN);

            for (int j = 0; j < M; j++) {
                int temp = Integer.parseInt(st.nextToken());
                for (int k = 0; k < N; k++) {
                    if (temp < arrN[k]) result++;
                }
            }
            System.out.println(result);
        }

    }
}
