package day0928.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_3789 {

    static int N;
    static int arr[][];
    static int area;
    static List<Integer> list = new ArrayList<>();
    static int res[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str," ");

        N = Integer.parseInt(str);

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        int count = 0;
//        max = area;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    area = 0;
                    count++;
                    BFS(i, j);
                    list.add(area);
                }
            }
        }

        res = new int[count];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        Arrays.sort(res);

        System.out.println(count);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static void BFS(int x, int y) {
        area++;
        arr[x][y] = 0;
        if (x + 1 < N) {
            if (arr[x + 1][y] == 1) BFS(x + 1, y);
        }
        if (x - 1 >= 0) {
            if (arr[x - 1][y] == 1) BFS(x - 1, y);
        }// 아래 오른 쪽 뿐만 아니라 위 왼쪽도 확인해줘야함

        if (y + 1 < N) {
            if (arr[x][y + 1] == 1) BFS(x, y + 1);
        }
        if (y - 1 >= 0) {
            if (arr[x][y - 1] == 1) BFS(x, y - 1);
        }
    }
}
