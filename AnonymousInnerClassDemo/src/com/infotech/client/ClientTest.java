package com.infotech.client;

public class ClientTest {

	public static void main(String[] args) {
		
		MyInterface interface1 = new MyInterfaceImpl();
		interface1.display();
		System.out.println("----------------------------------------");
		
		MyInterface myInterface2 = new MyInterface() {
			
			@Override
			public void display() {
				System.out.println("Welcome...");
			}
		};
		myInterface2.display();
		
		System.out.println("----------------------------------------");
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Task...");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
