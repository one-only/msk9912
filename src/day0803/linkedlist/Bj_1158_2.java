package day0803.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//예지님 코드 참고
public class Bj_1158_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        String[] array = br.readLine().split(" ");
//        int num = Integer.parseInt(array[0]);
//        int turn = Integer.parseInt(array[1]);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList();
        for (int i = 1; i <= n; i++) {
            list.add(i); // n길이의 숫자열
        }

        List<Integer> removeList = new ArrayList<>(); // 출력할 숫자열

        // iterator는 커서랑 유사하다 |1234567
        ListIterator<Integer> iter = list.listIterator();// 커서는 기본적으로 맨앞에 위치한다.
        // 리스트가 모두 빌 때까지 진행
        while (!list.isEmpty()) {
            for (int i = 0; i < k; i++) {
                // 다음 값이 있는 경우
                if (iter.hasNext()) {
                    if(i==k-1)
                        removeList.add(iter.next());
                    // 12|34567 현재 iter.next()는 커서 오른쪽의 숫자 3을 가리킴
                    else
                        iter.next(); // 1|234567  k번째 전까지
                }
                // 다음 값이 없는 경우
                else{
                    // 커서를 가장 앞으로 이동시킴
                    while (iter.hasPrevious())
                        iter.previous();
                    if(i==k-1)
                        removeList.add(iter.next());
                    else
                        iter.next();
                }
            }
            // 3칸 이동 후 삭제
            iter.remove(); // 12|4567 마지막으로 출력했던 숫자인 3을 제거
        }
        System.out.print("<");
        for (int i = 0; i < removeList.size(); i++) {
            System.out.print(removeList.get(i));
            if(i!=removeList.size()-1)
                System.out.print(", ");
        }
        System.out.print(">");

    }



}
