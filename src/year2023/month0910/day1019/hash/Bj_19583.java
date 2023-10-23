package year2023.month0910.day1019.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//싸이버개강총회
public class Bj_19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String S = st.nextToken();
        String E = st.nextToken();
        String Q = st.nextToken();
        //모든 시간의 입력은 HH:MM형식으로 동일하기 때문에 compareTo를 사용한 시간의 비교가 가능하다.

        Set<String> enter = new HashSet<>();
        Set<String> exit = new HashSet<>();
        Set<String> nameSet = new HashSet<>();

        String str = br.readLine();

        while (!str.isEmpty()) {
            String[] arr = str.split(" ");
            String time = arr[0];
            String name = arr[1];

            nameSet.add(name);
            if(S.compareTo(time) >= 0) {
                enter.add(name);
            }else if(E.compareTo(time) <= 0 && Q.compareTo(time) >= 0) {
                exit.add(name);
            }
        }
        int ans = 0;
        for(String name : nameSet) {
            if(enter.contains(name) && exit.contains(name)) {
                ans += 1;
            }
        }
        System.out.println(ans);

    }
}

/*
2. 문자 비교

같으면
0 반환
다르면
다른 문자의 개수만큼 리턴
근데 기준값과 비교값이 앞에서부터 동일한 문자가 나와야만 다른 문자 개수만큼 리턴이 가능
String str = "abcd";

str.compareTo("ab");
>> 4 - 2 = 2
str.compareTo("a");
>> 4 - 1 = 3
str.compareTo("c");
>> -2
>> ?

위 코드의 두번째 예제는 왜 -2인가?
기준값과 비교값이 앞에서부터 동일한 문자가 아니고 중간에 같은 문자일 경우 각각의 문자열에서 가장 낮은 아스키코드의 차이값을 리턴 하기 때문
String str = "abcd";

str.compareTo("c");
>> 각각 문자열의 가장 낮은 아스키코드 문자 : a와 c
>> 97 - 99 = -2
*/

/*
숫자형 비교

기준 값과 비교대상이 동일한 값일 경우 0
기준 값이 비교대상 보다 작은 경우 -1
기준 값이 비교대상 보다 큰 경우 1

Integer x = 3;
        Integer y = 4;
        Double z = 1.0;

        System.out.println( x.compareTo(y) );  // -1
        System.out.println( x.compareTo(3) );  //  0
        System.out.println( x.compareTo(2) );  //  1
        System.out.println( z.compareTo(2.7) );  //  -1
 */
