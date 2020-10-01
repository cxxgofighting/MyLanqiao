package exp3;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	private Queue<String>que=new LinkedList<String>();
	private int len=5;
	public synchronized void curri_req(String str) {
		while(que.size()>=len) {
			System.out.println("选课请求过多，请稍后！");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		que.add(str);
		System.out.println("有一个"+Thread.currentThread().getName()+"选课请求！");
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
		System.out.println(que.element()+"选课成功！");
		que.remove();
		notifyAll();
	}
}
