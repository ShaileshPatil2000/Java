package com.demo.beans;

public class myinter1Imp
{

	 protected void m1() {
		
		System.out.println("inside myinter1Imp m1");
	}

	 public void m2() {
			
			System.out.println("inside myinter1Imp m2");
		}
	 private void m3() {
		 System.out.println("inside myinter1Imp m3");
	 }
	 
	 public static void main(String[] args) {
		 myinter1Imp obj3 = new myinter1Imp();
		 obj3.m1();
		 obj3.m2();
		 obj3.m3();
	}
	 
}
