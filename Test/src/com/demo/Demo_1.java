package com.demo;

/**
 * @ClassName: Demo_1
 * @Description: ʹ��������Լɪ�����⣨���־����⣩
 * @author: bai-xiao-sheng
 * @Date: 2018��5��1�� ����2:15:08
 */
public class Demo_1 {

	public static void main(String[] args) {
		CycLink cyclink = new CycLink();
		cyclink.setLen(5);
		cyclink.createLink();
		cyclink.setK(2);
		cyclink.setM(2);
		cyclink.show();
		cyclink.play();
	}

}

/**
 * ѭ������
 */
class CycLink {
	Child firstChild = null;
	Child temp = null;
	int k;// ��ʾ�ӵڼ���С����ʼ��
	int m;// ��ʾ��������
	int len;// ��ʾ�м���С��

	public void setK(int k) {
		this.k = k;
	}

	public void setM(int m) {
		this.m = m;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public void play() {
		Child temp = this.firstChild;
		for (int i = 1; i < k; i++) {
			temp = temp.nextChild;
		}
		while(this.len!=1) {
			for (int j = 1; j < m; j++) {
				temp = temp.nextChild;
			}
			Child temp2 = temp;
			while (temp2.nextChild != temp) {
				temp2 = temp2.nextChild;
			}
			temp2.nextChild = temp.nextChild;
			temp = temp.nextChild;
			this.len--;
		}
		System.out.println("����Ȧ��С���ǣ�"+temp.no);
	}

	public void createLink() {
		for (int i = 1; i <= len; i++) {
			if (1 == i) {
				Child ch = new Child(i);
				this.firstChild = ch;
				this.temp = ch;
			} else if (len == i) {
				Child ch = new Child(i);
				temp.nextChild = ch;
				temp = ch;
				temp.nextChild = this.firstChild;
			} else {
				Child ch = new Child(i);
				temp.nextChild = ch;
				temp = ch;
			}
		}
	}

	public void show() {
		Child temp = this.firstChild;
		do {
			System.out.print(temp.no+" ");
			temp = temp.nextChild;
		} while (temp != this.firstChild);
	}
}

/**
 * Ȧ�е�С��
 */
class Child {
	int no;// С���ı��
	Child nextChild = null;

	public Child(int no) {
		this.no = no;
	}
}
