package com.scannerdelimiter;

import java.util.Scanner;

public class ScannerDelimiter {

	public static void main(String[] args) {
		Scanner s = new Scanner("abcd efghijkl..mnop,qrst uvwxyz"); //���ַ�������Դ��ȡ����
		s.useDelimiter(" |,|\\."); //���÷ָ���Ϊ�ո񡢶��Ż���
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
