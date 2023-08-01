import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

//        int[] arr = new int[n];
//        int[] res = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i+1;
//        }
//        res[0] = arr[3];

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        while(!list.isEmpty()){
            list.remove(2);
            System.out.println(list);
        }
    }
}
