package year2023.month0708.day0824.hash;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
//패션왕 신해빈
public class Bj_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
//                if (map.contains(key))
//                    map.put(key, map.get(key) + 1);
//                else
//                    map.put(key, 1);
            }
            int res = 1;
            for (int val : map.values())
                res *= val + 1;
            System.out.println(res - 1);
        }

    }
}
