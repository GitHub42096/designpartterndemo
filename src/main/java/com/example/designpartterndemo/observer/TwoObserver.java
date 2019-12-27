package com.example.designpartterndemo.observer;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class TwoObserver extends Observer {


	public TwoObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("观察者TwoObserver，接受到消息"+ subject.getState());
	}
}
