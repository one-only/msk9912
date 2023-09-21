package day0921;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

// 차집합
public class Bj_1822 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

//        int[] arrA = new int[A];
//        int[] arrB = new int[B];
//
//        String strA = br.readLine();
//        StringTokenizer stA = new StringTokenizer(strA, " ");
//
//        for (int i = 0; i < A; i++) {
//            arrA[i] = Integer.parseInt(stA.nextToken());
//        }
//
//        String strB = br.readLine();
//        StringTokenizer stB = new StringTokenizer(strB, " ");
//        for (int i = 0; i < B; i++) {
//            arrB[i] = Integer.parseInt(stB.nextToken());
//        }
//
//        for (int findA : arrA) {
//            for (int findB : arrB) {
//                if (findA == findB)
//            }
//        }

        TreeSet<Integer> Aset = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A; i++) {
            Aset.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int j=0; j<B; j++) {
            int Bnum = Integer.parseInt(st.nextToken());
            Aset.remove(Bnum);
        }

        bw.write(Aset.size()+"\n");
        for (Integer num : Aset) {
            bw.write(num+ " ");
        }
        bw.flush();
    }

}
