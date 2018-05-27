package com.shipin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: yunsuanfu
 * @Description:控制台接收输入
 * @author: 籍兆浃
 * @Date: 2018年4月21日 上午9:55:27
 */
public class yunsuanfu {

	public static void main(String[] args) {
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		//
		// try {
		// System.out.println("请输入第一个数：");
		// String a1 = br.readLine();
		// System.out.println("请输入第二个数：");
		// String a2 = br.readLine();
		// float f1 = Float.parseFloat(a1);
		// float f2 = Float.parseFloat(a2);
		// if(f1>f2) {
		// System.out.println("第一个数较大");
		// }
		// else if(f1 == f2) {
		// System.out.println("两个数相等");
		// }
		// else {
		// System.out.println("第二个数较大");
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// int a = 0;
		// float f = 1.1F;
		//// switch(f) {
		////
		//// }
		// System.out.println("switch中的值只能是byte,short,int,char,enum");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("请输入金字塔的层数：");
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

		// System.out.println("请输入镂空的金字塔的层数：");
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
		System.out.println("请输入镂空的菱形的层数（必须是奇数）：");
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
