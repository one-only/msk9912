package day1012.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1182 {
    static int[] num;
    private static int N; // 정수의 개수
    private static int S; // 정수의 합
    private static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        num = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        if (S == 0) System.out.println(answer - 1);
            //S 0일때가 전체 합이 0 일때랑 겹치기 때문에 -1 을 해주어야 합니다.
            //위의 사진에 공집합이 0이라고 볼 수 있습니다
        else  System.out.println(answer);
    }
    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) answer++;
            return;
        }
        //tree를 생각해서 직접 그려보면 이해하기가 쉽습니다.
        dfs(depth + 1, sum + num[depth]);
        dfs(depth + 1, sum);
    }
}
