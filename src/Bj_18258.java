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


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;

                case "front":
                    System.out.println(queue.peek());
                    break;

                case "pop":
                    if (queue.isEmpty()) System.out.println(-1);
                    else queue.remove();
                    break;

                case "back"://queue 메소드에는맨 뒤 데이터를 확인하는 방법이 없음

                    break;

                case "size":
                    System.out.println(queue.size());;
                    break;

                case "empty":
                    System.out.println(queue.isEmpty());
                    break;
            }
        }

    }
}
