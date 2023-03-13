package backjoonProject.chap1.ch_1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
 * ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
 * �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. 
 * ���� ���� ����.
 * 26���� �����Ѵ�. 
 * 2+6 = 8�̴�. 
 * ���ο� ���� 68�̴�. 
 * 6+8 = 14�̴�. 
 * ���ο� ���� 84�̴�. 
 * 8+4 = 12�̴�. 
 * ���ο� ���� 42�̴�. 
 * 4+2 = 6�̴�. 
 * ���ο� ���� 26�̴�.
 * ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. 
 * ���� 26�� ����Ŭ�� ���̴� 4�̴�.
 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.��.
 *  
 * input ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.��.
 * output ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.��.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// �Է�
		String str = br.readLine();
		if(Integer.parseInt(str) <= 9) {
			str = "0" + str;
		}
		
		// ���
		String sum = "";
		int count = 0;
		int a = Character.getNumericValue(str.charAt(0));
		int b = Character.getNumericValue(str.charAt(1));
		while(!str.equals(sum)) {
			String temp = String.valueOf(a + b);
			a = b;
			b = Character.getNumericValue(temp.charAt(temp.length()-1));
			sum = String.valueOf(a) + String.valueOf(b);
			count++;
		}
		bw.write(count+"\n");
		bw.flush();
		bw.close();
	}
}
