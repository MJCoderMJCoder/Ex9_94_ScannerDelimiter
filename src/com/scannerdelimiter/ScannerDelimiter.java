package com.scannerdelimiter;

import java.util.Scanner;

public class ScannerDelimiter {

	public static void main(String[] args) {
		Scanner s = new Scanner("abcd efghijkl..mnop,qrst uvwxyz"); //从字符串数据源获取数据
		s.useDelimiter(" |,|\\."); //设置分隔符为空格、逗号或句点
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
