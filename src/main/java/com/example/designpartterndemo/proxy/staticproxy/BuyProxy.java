package com.example.designpartterndemo.proxy.staticproxy;

import com.example.designpartterndemo.proxy.Buy;
import com.example.designpartterndemo.proxy.BuyHouse;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class BuyProxy implements BuyHouse {
	private Buy buy;
	public BuyProxy(Buy buy){
		this.buy = buy;
	}
	@Override
	public void buyHouse() {
		System.out.println("看房子....");
		buy.buyHouse();
		System.out.println("付钱，成交!");
	}
}
