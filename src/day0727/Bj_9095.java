package day0727;

import java.util.Scanner;
// 다이나믹 123
// 3단 피보나치
//re
public class Bj_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for (int i = 3; i < 11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr[num[i]-1]);
        }

    }
}
