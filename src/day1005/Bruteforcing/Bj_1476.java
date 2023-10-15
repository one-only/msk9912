package day1005.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int E = 0;
        int S = 0;
        int M = 0;
        int year = 0;
        while (true) {
            year++;
            E++;
            S++;
            M++;
            if (E == 16) E=1;
            if (S==29) S=1;
            if (M==20) M=1;
            if (e == E && m == M && S == s) break;
        }
        System.out.print(year);

    }
}
