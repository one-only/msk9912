package day0727.BFS;

import java.util.ArrayList;
import java.util.Scanner;
// bfs/dfs 영역구하기
// https://dding9code.tistory.com/6
// https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-2583%EB%B2%88-%EC%98%81%EC%97%AD-%EA%B5%AC%ED%95%98%EA%B8%B0-%EC%9E%90%EB%B0%94Java
// 위 두 링크 참고함
//re
public class Bj_2583 {
    static Scanner sc = new Scanner(System.in);
    static int M = sc.nextInt();
    static int N = sc.nextInt();
    static int K = sc.nextInt();

    static int[] dr = {-1, 1, 0, 0}; // y축, M
    static int[] dc = {0, 0, -1, 1}; //x축, N

    static int[][] arr = new int[M][N];
    static int count = 0;
    public static void main(String[] args) {

        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] == 0) {
                    count = 0;
                    DFS(i, j);
                    list.add(count);

                }
            }
        }

    }

    static void DFS(int r, int c) {
        arr[r][c] = 1;
        count++;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr >= 0 && nc >= 0 && nr < M && nc < N) {
                if(arr[nr][nc] == 0) DFS(nr,nc);
            }
        }
    }
}
