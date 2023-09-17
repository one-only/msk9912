package day0921;

import java.io.*;
import java.util.*;

public class Bj_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        List<String> strN = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            strN.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());

        List<String> strM = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            strM.add(st.nextToken());
        }


        for (String temp : strM) {
            if(strN.contains(temp)) {
                bw.write("1 ");
            } else bw.write("0 ");
        }


        bw.flush();
    }
}
