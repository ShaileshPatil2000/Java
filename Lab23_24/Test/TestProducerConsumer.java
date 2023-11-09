package Lab23_24.Test;

import Lab23_24.com.demo.beans.Storage;
import Lab23_24.Thread.Consumer;
import Lab23_24.Thread.Producer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Storage s=new Storage();
		Producer p=new Producer(s,10);
		Consumer c=new Consumer(s,10);
		p.start();
		c.start();
	}

}
