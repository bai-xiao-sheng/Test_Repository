package com.shipin;

/**
 * @ClassName: Test
 * @Description:java�İ��ֻ����������ͽ���
 * @author: bai-xiao-sheng
 * @Date: 2018��4��15�� ����8:52:20
 */
public class Test_jcsj {

	public static void main(String[] args) {
		// byte
		System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE); // 8
		System.out.println("��װ�ࣺjava.lang.Byte");
		System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE); // -128
		System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE); // 127
		System.out.println();

		// short
		System.out.println("�������ͣ�short ������λ����" + Short.SIZE); // 16
		System.out.println("��װ�ࣺjava.lang.Short");
		System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE); // -32768
		System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE); // 32767
		System.out.println();

		// int
		System.out.println("�������ͣ�int ������λ����" + Integer.SIZE); // 32
		System.out.println("��װ�ࣺjava.lang.Integer");
		System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE); // -2147483648
		System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE); // 2147483647
		System.out.println();

		// long
		System.out.println("�������ͣ�long ������λ����" + Long.SIZE); // 64
		System.out.println("��װ�ࣺjava.lang.Long");
		System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE); // -9223372036854775808
		System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE); // 9223372036854775807
		System.out.println();

		// float
		System.out.println("�������ͣ�float ������λ����" + Float.SIZE); // 32
		System.out.println("��װ�ࣺjava.lang.Float");
		System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE); // 1.4E-45
		System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE); // 3.4028235E38
		System.out.println();

		// double
		System.out.println("�������ͣ�double ������λ����" + Double.SIZE); // 64
		System.out.println("��װ�ࣺjava.lang.Double");
		System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE); // 4.9E-324
		System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println();

		// char
		System.out.println("�������ͣ�char ������λ����" + Character.SIZE); // 16
		System.out.println("��װ�ࣺjava.lang.Character");
		// ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨
		System.out.println("��Сֵ��Character.MIN_VALUE=" + (int) Character.MIN_VALUE); // 0
		// ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨
		System.out.println("���ֵ��Character.MAX_VALUE=" + (int) Character.MAX_VALUE); // 65535

		System.out.println();
		System.out.println("��Ҫע�⣺");
		System.out.println("1���;������Ϳ�����߾�������ֱ��ת�����߾���������;�������ת����Ҫǿ��ת��");
		char c = '��';
		System.out.println("2��cha�����п��԰������ģ�c=" + c);
		char d = 'c'+1;
		System.out.println("3��cha���ͼ����Ǹ���assic��ֵ����ģ�d=" + d);
	}

}
