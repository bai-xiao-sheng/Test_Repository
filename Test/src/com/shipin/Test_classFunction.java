package com.shipin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Test_classFunction
 * @Description:ʹ���෽������һ������1-9֮��������������Ӧ�ĳ˷���;����ת��
 * @author: bai-xiao-sheng
 * @Date: 2018��4��28�� ����4:22:21
 */
public class Test_classFunction {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// CFB cfb = new CFB();
		// System.out.println("������һ��1-9֮�ڵ�������");
		// try {
		// String str = br.readLine();
		// int n = Integer.valueOf(str);
		// cfb.printCFB(n);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] num1 = new int[3][3];
		System.out.println("����ת��ǰ�ǣ�");
		for (int i = 1; i <= 9; i++) {
			if (0 == i % 3) {
				System.out.println(i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		//����ת��
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				num1[j][k] = num[k][j];
			}
		}
		System.out.println("����ת�ú��ǣ�");
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(num1[j][k]+" ");
			}
			System.out.println();
		}
	}

}

class CFB {
	public void printCFB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + " ");
				if (i * j < 10 && 2 == j) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}