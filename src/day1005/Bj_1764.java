package day1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        HashSet set = new HashSet<>();

        for (int i = 0; i < num1; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < num2; i++) {
            String temp = br.readLine();
            if (set.contains(temp)) {
                res.add(temp);
            }
        }

        Collections.sort(res);
        System.out.println(res.size());
        for (String s : res) {
            System.out.println(s);
        }
    }
}
