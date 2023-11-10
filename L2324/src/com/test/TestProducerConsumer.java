package com.test;

import com.demo.beans.Storage;
import com.thread.Consumer;
import com.thread.Producer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Storage s=new Storage();
		Producer p=new Producer(s,10);
		Consumer c=new Consumer(s,10);
		p.start();
		c.start();
	}
}