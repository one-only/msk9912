package year2023.month0910.day1019.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,String> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String team = br.readLine();
            int mem = Integer.parseInt(br.readLine());
            for (int j = 0; j < mem; j++) {
                String name = br.readLine();
                map.put(team, name);
            }
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (br.readLine() == "1") {
                Iterator<String> it = map.keySet().iterator();
                while(it.hasNext()) {
                    String key = it.next();
                    StringTokenizer st3 = new StringTokenizer(map.get(key)," ");


                    while(st3.hasMoreTokens()) {
                        String str = st3.nextToken();
                        if(name.equals(str)) {
                            sb.append(key+"\n");
                        }
                    }
                }
            } else {
                StringTokenizer st2 = new StringTokenizer(map.get(name)," ");
                while(st2.hasMoreTokens()) {
                    arr.add(st2.nextToken());
                }
                Collections.sort(arr);
                for(int j=0; j<arr.size();j++) {
                    sb.append(arr.get(j)+"\n");
                }
            }
        }
    }
}
