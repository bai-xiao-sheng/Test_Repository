package com.shipin;

/**
 * @ClassName: Test
 * @Description:java的八种基础数据类型介绍
 * @author: bai-xiao-sheng
 * @Date: 2018年4月15日 下午8:52:20
 */
public class Test_jcsj {

	public static void main(String[] args) {
		// byte
		System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE); // 8
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE); // -128
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE); // 127
		System.out.println();

		// short
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE); // 16
		System.out.println("包装类：java.lang.Short");
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE); // -32768
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE); // 32767
		System.out.println();

		// int
		System.out.println("基本类型：int 二进制位数：" + Integer.SIZE); // 32
		System.out.println("包装类：java.lang.Integer");
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE); // -2147483648
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE); // 2147483647
		System.out.println();

		// long
		System.out.println("基本类型：long 二进制位数：" + Long.SIZE); // 64
		System.out.println("包装类：java.lang.Long");
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE); // -9223372036854775808
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE); // 9223372036854775807
		System.out.println();

		// float
		System.out.println("基本类型：float 二进制位数：" + Float.SIZE); // 32
		System.out.println("包装类：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE); // 1.4E-45
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE); // 3.4028235E38
		System.out.println();

		// double
		System.out.println("基本类型：double 二进制位数：" + Double.SIZE); // 64
		System.out.println("包装类：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE); // 4.9E-324
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println();

		// char
		System.out.println("基本类型：char 二进制位数：" + Character.SIZE); // 16
		System.out.println("包装类：java.lang.Character");
		// 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
		System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE); // 0
		// 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
		System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE); // 65535

		System.out.println();
		System.out.println("需要注意：");
		System.out.println("1、低精度类型可以向高精度类型直接转换，高精度类型向低精度类型转换需要强制转换");
		char c = '中';
		System.out.println("2、cha类型中可以包含中文，c=" + c);
		char d = 'c'+1;
		System.out.println("3、cha类型计算是根据assic码值计算的，d=" + d);
	}

}
