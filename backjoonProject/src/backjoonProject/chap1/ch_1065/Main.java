package backjoonProject.chap1.ch_1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *  
 * input : ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * output : ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		if(str.length() <= 2) bw.write(Integer.parseInt(str) + "\n");
		else {
			int count = 99;
			for(int j=100; j<=Integer.parseInt(str); j++) {
				String jToStr = String.valueOf(j);
				String ap = String.valueOf(jToStr.charAt(0) - jToStr.charAt(1));
				for(int i=1; i<jToStr.length()-1; i++) {
					String ap2 = String.valueOf(jToStr.charAt(i) - jToStr.charAt(i+1));
					if(!ap.equals(ap2)) break;
					else count++;
				}
			}
			bw.write(count+"\n");
		}		
		bw.flush();
		bw.close();
	}
}
