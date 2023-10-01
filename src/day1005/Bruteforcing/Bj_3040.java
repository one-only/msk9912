package day1005.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백설공주
public class Bj_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];// 난쟁이 숫자의 총합
        }
        int res = total - 100;//총합에서 100을 뺌으로써 100과의 차이를 구함
        int num1 = 0, num2 = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (arr[i] + arr[j] == res) {
                    num1 = i;//100과의 차이값이 되는 두 수 의 합을 구함
                    num2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == num1 || i == num2) continue;
            System.out.println(arr[i]);// 두 수를 제외하고 출력
        }
    }
}
