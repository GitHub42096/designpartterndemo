package com.example.designpartterndemo.observer;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class MainTest {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new OneObserver(subject);
		new TwoObserver(subject);
		new ThreeObserver(subject);

		System.out.println("First state change: 10");
		subject.setState(15);
		System.out.println("Second state change: 15");
		subject.setState(10);
	}
}
