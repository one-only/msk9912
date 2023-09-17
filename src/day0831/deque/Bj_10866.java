package day0831.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    if (deque.isEmpty()) list.add(-1);
                    else list.add(deque.pollFirst());
                    break;

                case "pop_back":
                    if (deque.isEmpty()) list.add(-1);
                    else list.add(deque.pollLast());
                    break;

                case "size":
                    list.add(deque.size());
                    break;

                case "empty":
                    if (deque.isEmpty()) list.add(1);
                    else list.add(0);
                    break;

                case "front":
                    if (deque.isEmpty()) list.add(-1);
                    else list.add(deque.getFirst());
                    break;

                case "back":
                    if (deque.isEmpty()) list.add(-1);
                    else list.add(deque.getLast());
                    break;

            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
