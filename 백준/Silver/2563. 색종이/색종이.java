import java.io.*;
import java.util.*;

public class Main {
    public int solution(int[][] arr) {
        int answer = 0;
        boolean[][] board = new boolean[101][101];
        for (int i = 0; i < arr.length; i++) {
            for (int x = arr[i][0]; x < arr[i][0] + 10; x++) {
                for (int y = arr[i][1]; y < arr[i][1] + 10; y++) {
                    if (!board[x][y]) {
                        board[x][y] = true;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(token.nextToken());
            arr[i][1] = Integer.parseInt(token.nextToken());
        }
        System.out.println(T.solution(arr));
    }
}