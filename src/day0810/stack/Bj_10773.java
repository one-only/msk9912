package day0810.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택 제로
public class Bj_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine()); //int로 바꿔서 저장
            if(num == 0) stack.pop();// 0이면 stack에서 하나 빼기
            else stack.push(num);// 0이 아니면 stack에 추가
        }
        while(!stack.isEmpty()){// stack이 빌 때까지
            sum += stack.pop();// 합하기
        }
        System.out.println(sum);
    }
}
