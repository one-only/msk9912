import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bj_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }
        int temp = 0;
        while(!queue.isEmpty()){
            temp = queue.peek();
            queue.remove();
            if (!queue.isEmpty()){
                temp = queue.peek();
                queue.remove();
                queue.add(temp);
            }

        }
        System.out.println(temp);
    }
}
