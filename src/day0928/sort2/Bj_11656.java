package day0928.sort2;

import java.io.*;
import java.util.Arrays;

//접미사 배열
public class Bj_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();

        String[] strArray = new String[st.length()];
        for (int i = 0; i < st.length(); i++) {
            strArray[i] = st.substring(i, st.length());
        }
        Arrays.sort(strArray);

        for (String str: strArray) {
            bw.write(str);
            bw.write("\n");
        }
        bw.flush();
    }
}
