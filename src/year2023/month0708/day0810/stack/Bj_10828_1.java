package year2023.month0708.day0810.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_10828_1 {
    // int 배열 생성
    public static int[] stack;
    public static int size = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String을 합치는 작업 시 유용
        StringBuilder sb = new StringBuilder();


        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        // variable--; variable > 0; 이 두 가지를 합쳐놓은 것
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                // 함수를 아래에 따로 선언
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    // stringbuilder는 .append()를 이용해 값 추가(합성)
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }

        }
        System.out.println(sb);
    }


    // size는 처음에 0으로 선언함
    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }

}

