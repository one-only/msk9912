package day0810.stack;

import java.io.*;
import java.util.Stack;

// 10828번 스택
public class Bj_10828_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야 한다.
        //그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에
        // 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야 한다.

        // 스택 사용
        Stack<Integer> s = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    s.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if (s.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.pop() + "\n");
                    }
                    break;
                case "size":
                    bw.write(s.size() + "\n");
                    break;
                case "empty":
                    if (s.empty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "top":
                    if (s.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.peek() + "\n");
                    }
                    break;
            }

        }
        bw.flush();
        bw.close();
    }
}
