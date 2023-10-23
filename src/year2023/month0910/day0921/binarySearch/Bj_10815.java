package year2023.month0910.day0921.binarySearch;

import java.io.*;
import java.util.*;

// 시간 초과
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
        // hashset은 key값을 이용해 검색하므로 시간복잡도가 훨씬 낮음
        // list는 전체탐색이라 오래 걸림

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            strM.add(st.nextToken());
        }


//        for (String temp : strM) {
//            if(strN.contains(temp)) {
//                bw.write("1 ");
//            } else bw.write("0 ");
//        }

        for (int i = 0; i < M; i++) {
            String temp = strM.get(i);
            if(strN.contains(temp)) {
                bw.write("1 ");
            } else bw.write("0 ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
