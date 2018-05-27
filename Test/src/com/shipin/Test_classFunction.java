package com.shipin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Test_classFunction
 * @Description:使用类方法接收一个介于1-9之间的整数，输出相应的乘法表;矩阵转置
 * @author: bai-xiao-sheng
 * @Date: 2018年4月28日 下午4:22:21
 */
public class Test_classFunction {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// CFB cfb = new CFB();
		// System.out.println("请输入一个1-9之内的整数：");
		// try {
		// String str = br.readLine();
		// int n = Integer.valueOf(str);
		// cfb.printCFB(n);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] num1 = new int[3][3];
		System.out.println("矩阵转置前是：");
		for (int i = 1; i <= 9; i++) {
			if (0 == i % 3) {
				System.out.println(i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		//进行转置
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				num1[j][k] = num[k][j];
			}
		}
		System.out.println("矩阵转置后是：");
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