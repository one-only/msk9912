package day0803.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//재원님 코드 참고
public class Bj_1158_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Queue<Integer> que = new LinkedList<>(); // queue에다가 linkedlist를 만드는 이유가 뭘까?

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // String 객체끼리 더하는 방법은 메모리 할당과 해제를 발생시키는데, 덧셈 연산이 많아진다면 성능적으로 좋지 않다.
        // str1, str2, str3 연결 str1 += str2 += str3
        // Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어
        StringBuilder str = new StringBuilder();
        //        String string = str;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다


        str.append("<");

        for (int i = 1; i <= n; i++) {
            que.offer(i);
            // add(), offer() 차이점
            // add() 큐가 꽉 찬 경우 IllegalStateException 에러 발생
            // offer() 값 추가 실패 시 false 반환
        }
        while(!que.isEmpty()) {
            if(que.size() == 1) {
                str.append(que.poll());
            } else {
                for(int i = 0; i < k - 1 ; i++) {
                    que.offer(que.poll());
                    // k번째 전까지 pop했다가 push해줌
                }
                str.append(que.poll()).append(", ");
                // k번째는 pop해주고 pop해준 값을 str에 추가해줌

            }
        }
        str.append(">");
        System.out.println(str);
    }



}
