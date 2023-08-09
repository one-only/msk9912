package day0810.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택 탑
// 몰라
public class Bj_2493 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(st.nextToken()));
        }
        while (!stack.isEmpty()){
            N--;
            int temp = stack.pop();
            if (stack.peek() > temp) arr[4] = N;
        }
    }
}
