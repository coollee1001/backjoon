package backjoonProject.chap1.ch_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ������ ū �迭�� ������ ���� �м����� �����ִ�.
 * 1/1	1/2	1/3	1/4	1/5	��
 * 2/1	2/2	2/3	2/4	��	��
 * 3/1	3/2	3/3	��	��	��
 * 4/1	4/2	��	��	��	��
 * 5/1	��	��	��	��	��
 * ��	��	��	��	��	��
 * �̿� ���� ������ �м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
 * X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  
 * input : ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
 * 
 * output : ù° �ٿ� �м��� ����Ѵ�.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); 
		int cross_count = 1;
        int prev_count_sum = 0;
 
		while (true) {
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 				
				else {	
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				} 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}
