package Lab22.com.demo.thread;

import Lab22.com.demo.beans.MyTask;

public class MytableThread extends Thread {
	private MyTask ob;
	private int n;

	public MytableThread(MyTask ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
		ob.PrintTable(n);
	}

}
