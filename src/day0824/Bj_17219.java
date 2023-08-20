package day0824;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

//        String[][] arr = new String[N][2];
//
//        for (int i = 0; i < N; i++) {
//            String str2 = br.readLine();
//            StringTokenizer st2 = new StringTokenizer(str2, " ");
//            arr[i][0] = st2.nextToken();
//            arr[i][1] = st2.nextToken();
//        }
//
//
//
//        for (int i = 0; i < M; i++) {
//            String temp = br.readLine();
//            for (int j = 0; j < N; j++) {
//                if(arr[j][0].equals(temp)){
//                    bw.write(arr[j][1]+"\n");
//                    break;
//                }
//            }
//        }

        HashMap<String,String> map = new HashMap<String,String>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            bw.write(map.get(br.readLine())+"\n");
        }

        bw.flush();
        bw.close();
    }
}
