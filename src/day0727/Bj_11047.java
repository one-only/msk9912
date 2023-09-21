package day0727;

import java.util.Scanner;
//동전0
//re
public class Bj_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        int total = 0;
        while(num != 0) {
            total += num / arr[count-1];
            num %= arr[count-1];
            count--;
        }
        System.out.println(total);
    }
}
