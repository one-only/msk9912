package day1019.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        for (int i = 0; i < N; i++) {
            map1.put(i+1, br.readLine());
            map2.put(br.readLine(), i+1);
        }

        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if("1".charAt(0) <= temp.charAt(0) && temp.charAt(0) <= "9".charAt(0)) {
                sb.append(map1.get(Integer.parseInt(temp))).append("\n");
            } else {
                sb.append(map2.get(temp)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
