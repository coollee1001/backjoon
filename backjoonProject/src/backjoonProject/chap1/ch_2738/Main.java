package backjoonProject.chap1.ch_2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 * 
 * input : 
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다
 * 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다
 * 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다
 * N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 * 
 * output : 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 * 
 * @author siwon
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 행렬의 크기 N과 M을 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // 두 행렬 A와 B를 입력
        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 결과 행렬 및 덧셈
        int[][] result = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        // 결과 행렬
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}

