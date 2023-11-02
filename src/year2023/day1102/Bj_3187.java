package year2023.day1102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_3187 {

    static char[][] arr;
    static int R, C;
    static int v, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[R][C];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int vsum = 0, ksum = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] != '#') { //울타리가 아닐 때
                    BFS(i, j);
                    if (k > v) v = 0;
                    else k = 0;
                    vsum += v;
                    ksum += k;
                    v = 0;
                    k = 0;
                }
            }
        }
        System.out.printf("%s %s", ksum, vsum);
    }

    private static void BFS(int x, int y) {
        if (arr[x][y] == 'v') {
            v++;
        }
        else if (arr[x][y] == 'k') {
            k++;
        }
        arr[x][y] = '#'; // 울타리는 방문한 것으로 간주하므로 울타리로 바꿔줌

        if (x + 1 < R) {
            if (arr[x + 1][y] != '#') BFS(x + 1, y);
        }
        if (x - 1 >= 0) {
            if (arr[x - 1][y] != '#') BFS(x - 1, y);
        }

        if (y + 1 < C) {
            if (arr[x][y + 1] != '#') BFS(x, y + 1);
        }
        if (y - 1 >= 0) {
            if (arr[x][y - 1] != '#') BFS(x, y - 1);
        }
    }
}
