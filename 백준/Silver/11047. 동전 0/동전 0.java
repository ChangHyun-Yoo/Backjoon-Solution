import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for(int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        while(K != 0) {
            int coin = 0;
            for(int i = N - 1; i >= 0; i--) {
                if(coins[i] <= K) {
                    coin = i;
                    break;
                }
            }

            answer += K / coins[coin];
            K -= (K / coins[coin]) * coins[coin];
        }

        System.out.println(answer);
    }
}