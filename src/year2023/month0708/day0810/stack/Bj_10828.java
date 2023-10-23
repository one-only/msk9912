package year2023.month0708.day0810.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 스택
public class Bj_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 스택 생성
        Stack<Integer> stack = new Stack<>();
        // 출력값을 저장해둘 리스트를 생성
        List<Integer> list = new ArrayList<>();

        // 명령 입력 횟수를 저장
        int n = Integer.parseInt(br.readLine());

        // 명령횟수만큼 for문을 반복
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            // 띄어쓰기 기준으로 분리
            StringTokenizer st = new StringTokenizer(str, " ");
            // 입력값에 따라 switch case문을 이용해 작업 처리
            switch (st.nextToken()) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (stack.isEmpty()) list.add(-1);
                    else {
//                        list.add(stack.peek());
//                        stack.pop();
                        // 간결하게 변경
                        list.add(stack.pop());
                    }
                    break;

                case "size":
                    list.add(stack.size());
                    break;

                case "empty":
                    if (stack.isEmpty()) list.add(1);
                    else list.add(0);
                    break;

                case "top":
                    if (stack.isEmpty()) list.add(-1);
                    // top이 존재하지 않는데 호출했었더니 런차임에러(Empty Stack)이 발생했었음
                    else list.add(stack.peek());
                    break;

            }
        }

        // System.out.println(list);
        // 위와 같이 출력할 경우 [2, 2, 0, 2, 1, -1, 0, 1, -1, 0, 3]
        // 처럼 나오기 때문에 하나씩 출력하려면
        // list.get(i)를 for문을 이용해 출력해준다

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
