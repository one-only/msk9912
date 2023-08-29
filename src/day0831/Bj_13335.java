package day0831;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj_13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int n = Integer.parseInt(st.nextToken()); // 다리를 건너는 트럭의 수
        int w = Integer.parseInt(st.nextToken()); // 다리의 길이
        int L = Integer.parseInt(st.nextToken()); // 다리의 최대 하중

        Queue<Integer> truck = new LinkedList<>(); // 시간
        Queue<Integer> bridge = new LinkedList<>(); //다리의 무게

        int time = 0; // 시간
        int bridgeWeight = 0; // 다리의 무게

        for (int i = 0; i < n; i++) {
            truck.offer(Integer.parseInt(st.nextToken())); // 트럭의 무게
            // offer 값 리턴, add 예외 발생
        }

        for (int i = 0; i < w; i++) {
            bridge.add(0); // 다리를 모두 0으로 초기화
        }

        while(!bridge.isEmpty()) { // 다리 위에 아무것도 없을 때까지
            time++;
           bridgeWeight -= bridge.poll(); // 다리 무게에서 내려온 트럭 무게를 뺌
            if(!truck.isEmpty()){ // 트럭이 남아 있다면
                if (truck.peek()+bridgeWeight <= L){ // 앞의 트럭이 더해져도 다리의 최대하중보다 적으면
                    bridgeWeight += truck.peek();
                    bridge.offer(truck.poll());
                }else {
                    bridge.offer(0);
                }
            }
        }
        System.out.println(time);
    }
}
