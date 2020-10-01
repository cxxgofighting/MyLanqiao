package exp3;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	private Queue<String>que=new LinkedList<String>();
	private int len=5;
	public synchronized void curri_req(String str) {
		while(que.size()>=len) {
			System.out.println("ѡ��������࣬���Ժ�");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		que.add(str);
		System.out.println("��һ��"+Thread.currentThread().getName()+"ѡ������");
		notifyAll();
	}
	public synchronized void data_req() {
		while(que.size()<=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(que.element()+"ѡ�γɹ���");
		que.remove();
		notifyAll();
	}
}
