package day0803.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//re
public class Bj_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        // 큐(Queue)와 덱(Deque)의 차이점
        // 큐: 입력과 출력이 각자의 방향으로만 이루어짐
        // 덱: 입력과 출력이 양쪽 모두에서 가능


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            switch (st.nextToken()) {
                case "push":
                    deque.add(Integer.parseInt(st.nextToken()));
                    // deque.push() 함수를 이용할 경우 맨 뒤가 아닌 맨 앞에 들어가는 문제가 있었음
                    break;

                case "front":
                    if (deque.isEmpty()) list.add(-1);
                    // 큐에 정수 없는데 아래 peek와 같은 명령 내리면 런타임에러(NoSuchElement) 발생
                    else list.add(deque.peek());
                    break;

                case "pop":
                    if (deque.isEmpty()) list.add(-1);
                    else list.add(deque.remove());
                    // deque.pop()함수를 이용했을 때는 맨 앞에 값이 빠지지 않고 맨 뒤 값이 빠지는 문제가 있었음
                    break;

                case "back":
                    //day0803.deque 메소드에는맨 뒤 데이터를 확인하는 방법이 없음
//                    Queue<Integer> temp = new LinkedList<>(deque);
//                    while(temp.size() != 1){
//                        temp.remove();
//                    }
//                    list.add(temp.peek());
                    if (deque.isEmpty()) list.add(-1);
                    else list.add(deque.getLast());
                    // queue와 달리 dequeue는 맨 뒤 값을 확인할 수 있음

                    break;

                case "size":
                    list.add(deque.size());
                    break;

                case "empty":
                    if (deque.isEmpty()) list.add(1);
                    else list.add(0);
                    break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
