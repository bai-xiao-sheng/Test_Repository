package com.shipin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: yunsuanfu
 * @Description:����̨��������
 * @author: �����
 * @Date: 2018��4��21�� ����9:55:27
 */
public class yunsuanfu {

	public static void main(String[] args) {
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		//
		// try {
		// System.out.println("�������һ������");
		// String a1 = br.readLine();
		// System.out.println("������ڶ�������");
		// String a2 = br.readLine();
		// float f1 = Float.parseFloat(a1);
		// float f2 = Float.parseFloat(a2);
		// if(f1>f2) {
		// System.out.println("��һ�����ϴ�");
		// }
		// else if(f1 == f2) {
		// System.out.println("���������");
		// }
		// else {
		// System.out.println("�ڶ������ϴ�");
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// int a = 0;
		// float f = 1.1F;
		//// switch(f) {
		////
		//// }
		// System.out.println("switch�е�ֵֻ����byte,short,int,char,enum");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("������������Ĳ�����");
		// try {
		// String s = bf.readLine();
		// int b = Integer.parseInt(s);
		// for (int i = 1; i <= b; i++) {
		// for (int j = 1; j <= b - i; j++) {
		// System.out.print(" ");
		// }
		// for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// System.out.println("�������οյĽ������Ĳ�����");
		// try {
		// String s = bf.readLine();
		// int b = Integer.parseInt(s);
		// for (int i = 1; i <= b; i++) {
		// for (int j = 1; j <= b - i; j++) {
		// System.out.print(" ");
		// }
		// for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
		// if (i < b) {
		// if (k == 1 || k == (i - 1) * 2 + 1) {
		// System.out.print("*");
		// } else {
		// System.out.print(" ");
		// }
		// } else {
		// System.out.print("*");
		// }
		//
		// }
		// System.out.println();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		System.out.println("�������οյ����εĲ�������������������");
		String s;
		try {
			s = bf.readLine();
			int b = Integer.parseInt(s);
			// int b = 9;
			for (int i = 1; i <= b; i++) {
				if (i <= b / 2 + 1) {
					for (int j = 1; j <= b / 2 + 1 - i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= i * 2 - 1; k++) {
						if (k == 1 || k == i * 2 - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				} else {
					for (int j = i - b / 2 - 1; j >= 1; j--) {
						System.out.print(" ");
					}
					for (int k = 1; k <= (b - i) * 2 + 1; k++) {
						if (k == 1 || (k == (b - i) * 2 + 1 && i != b)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
