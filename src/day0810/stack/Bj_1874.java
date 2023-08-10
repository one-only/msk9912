package day0810.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

// 스택 수열
// 백준에서 틀렸다 나옴 대체 왜지
//re
public class Bj_1874 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> array = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int temp = 0;
        while(temp < n){

            if(!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                array.add("-");
                num = Integer.parseInt(br.readLine());
            } //else if (num > n)
            else {
                stack.push(temp+1);
                array.add("+");
                temp++;
            }
        }
        stack.pop();
        array.add("-");

        while(!stack.isEmpty()){
            if (Integer.parseInt(br.readLine()) == stack.peek()){
                stack.pop();
                array.add("-");
            }
            else {
                stack.pop();
                array.clear();
            }
        }


        if (!array.isEmpty()){
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }
        }else {
            System.out.println("NO");
        }







//        for (int i = 0; i < n; i++) {
//            if(!stack.isEmpty() && stack.peek() == num) {
//                System.out.println("pop"+stack.pop());
//                array.add("-");
//                num = Integer.parseInt(br.readLine());
//                System.out.println("num"+num);
//            } //else if (num > n)
//            else {
//                System.out.println("push"+ (i+1));
//                stack.push(i+1);
//                array.add("+");
//            }
//
//        }

//        for (int i = 0; i < n; i++) {
//            while (j != br.read()){
//                j++;
//                stack.push(j);
//                array.add("+");
//            }
//            j--;
//            stack.pop();
//            array.add("-");
//        }

    }
}
