package day0727;

import java.util.Scanner;

public class Bj_2583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int count = sc.nextInt();
        int[][] arr = new int[M][N];

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        arr[y1][x1] = 1;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        arr[y2][x2] = 1;


        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
