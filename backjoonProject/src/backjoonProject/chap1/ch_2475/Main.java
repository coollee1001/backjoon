package backjoonProject.chap1.ch_2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * ��ǻ�͸� �����ϴ� ȸ���� KOI ���ڿ����� �����ϴ� ��ǻ�͸��� 6�ڸ��� ������ȣ�� �ű��. 
 * ������ȣ�� ó�� 5�ڸ����� 00000���� 99999������ �� �� �ϳ��� �־����� 6��° �ڸ����� �������� ����. 
 * �������� ������ȣ�� ó�� 5�ڸ��� ���� 5���� ���ڸ� ���� ������ ���� ���� 10���� ���� �������̴�.
 * ���� ��� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�, �� ���ڸ� ������ ������ �� 0+16+4+25+36 = 81 �� 10���� ���� �������� 1�� �������̴�.
 * 
 * input : ù° �ٿ� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� ��ĭ�� ���̿� �ΰ� �ϳ��� �־�����.
 * output : ù° �ٿ� �������� ����Ѵ�.
 * @author siwon
 *
 */
public class Main {
	private final static int MAX = 3;
	private final static String REMAINDER_VALUE = String.valueOf(10);
	private final static List<BigInteger> bigIntegerList = new ArrayList<BigInteger>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tempStr = br.readLine().split(" ");
		for(int index=0; index<MAX; index++) { // ���� ����			
			BigInteger tempBig = new BigInteger(tempStr[index]);
			bigIntegerList.add(tempBig.multiply(tempBig)); // ������ ����Ʈ�� �߰�
		}		
		System.out.println(valid(bigIntegerList, MAX-1).remainder(new BigInteger(REMAINDER_VALUE)));
	}
	
	private static BigInteger valid(List<BigInteger> bigIntegerList, int max) { // ������ ���
		if(max == 0) return bigIntegerList.get(max).add(new BigInteger("0"));
		return bigIntegerList.get(max).add(valid(bigIntegerList, max-1));
	}
}
