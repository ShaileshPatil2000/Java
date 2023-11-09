package Lab23_24.Thread;

import Lab23_24.com.demo.beans.Storage;

public class Producer extends Thread {
     private Storage s;
     private int n;
     public Producer(Storage s,int n) {
    	 this.s=s;
    	 this.n=n;
     }
	 public void run() {
		 for(int i=0;i<n;i++) {
				s.put(i);
				
			}
	 }
}
