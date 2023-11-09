package com.demo.test;

import com.demo.beans.myinter1Imp;

public class myclass extends myinter1Imp {
	public static void main(String[] args) {
		
		myinter1Imp obj3 = new myclass();
		obj3.m2();
		
		
		myinter1Imp obj = new myinter1Imp();
		obj.m2();
		myclass obj1 = new myclass();
	obj1.m1();
//	obj1.m3();
	}
	
}
