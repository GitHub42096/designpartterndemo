package com.example.designpartterndemo.proxy;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class Buy implements BuyHouse {

	@Override
	public void buyHouse() {
		System.out.println("买房子....");
	}
}
