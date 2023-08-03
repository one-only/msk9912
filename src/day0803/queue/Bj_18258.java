package day0803.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
//                    System.out.println(day0803.queue);
                    break;

                case "front":
                    result.add(queue.peek());
//                    System.out.println(day0803.queue);
                    break;

                case "pop":
                    if (queue.isEmpty()) result.add(-1);
                    else {
                        result.add(queue.peek());
                        queue.remove();
                    }
//                    System.out.println(day0803.queue);
                    break;

                case "back"://day0803.queue 메소드에는맨 뒤 데이터를 확인하는 방법이 없음
                    Queue<Integer> temp = new LinkedList<>(queue);
//                    System.out.println(day0803.queue);
                    while(temp.size() != 1){
                        temp.remove();
                    }
                    result.add(temp.peek());
//                    System.out.println(day0803.queue);
                    break;

                case "size":
                    result.add(queue.size());
//                    System.out.println(day0803.queue);
                    break;

                case "empty":
                    if (queue.isEmpty()) result.add(1);
                    else result.add(0);
//                    System.out.println(day0803.queue);
                    break;
            }
        }
        while(!result.isEmpty()) {
            System.out.println(result.peek());
            result.remove();
        }

    }
}
