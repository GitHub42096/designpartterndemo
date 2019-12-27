package com.example.designpartterndemo.proxy.dynamicproxy.jdkdynamicproxy;

import com.example.designpartterndemo.proxy.Buy;
import com.example.designpartterndemo.proxy.BuyHouse;

import java.lang.reflect.Proxy;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class MainTest {

	 public static void main(String[] args){

		 Buy buy = new Buy();

		 BuyHouse proxyBuy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buy));

		 proxyBuy.buyHouse();
	 }
}
