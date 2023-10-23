package year2023.month0708.day0824.sort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

//수 정렬하기4
public class Bj_11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer i : arr)
            bw.write(i + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
