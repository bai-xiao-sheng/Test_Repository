package com.demo;

/**
 * @ClassName: Demo_1
 * @Description: 使用链表解决约瑟夫问题（丢手绢问题）
 * @author: bai-xiao-sheng
 * @Date: 2018年5月1日 下午2:15:08
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
 * 循环链表
 */
class CycLink {
	Child firstChild = null;
	Child temp = null;
	int k;// 表示从第几个小孩开始数
	int m;// 表示数几个数
	int len;// 表示有几个小孩

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
		System.out.println("最后出圈的小孩是："+temp.no);
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
 * 圈中的小孩
 */
class Child {
	int no;// 小孩的编号
	Child nextChild = null;

	public Child(int no) {
		this.no = no;
	}
}
