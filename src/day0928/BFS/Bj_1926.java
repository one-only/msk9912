package day0928.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 그림
public class Bj_1926 {

    static int n, m;
    static int arr[][];
    static int area, max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        max = area;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    area = 0;
                    count++;
                    BFS(i, j);
                    if (area > max) max = area;
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    private static void BFS(int x, int y) {
        area++;
        arr[x][y] = 0;
        if (x + 1 < n) {
            if (arr[x + 1][y] == 1) BFS(x + 1, y);
        }
        if (x - 1 >= 0) {
            if (arr[x - 1][y] == 1) BFS(x - 1, y);
        }// 아래 오른 쪽 뿐만 아니라 위 왼쪽도 확인해줘야함

        if (y + 1 < m) {
            if (arr[x][y + 1] == 1) BFS(x, y + 1);
        }
        if (y - 1 >= 0) {
            if (arr[x][y - 1] == 1) BFS(x, y - 1);
        }
    }
}
//4 5
//1 1 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 1 1

//출력
//1
//14
