package com.example.designpartterndemo.proxy.staticproxy;

import com.example.designpartterndemo.proxy.Buy;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class MainTest {

	 public static void main(String[] args){
	 	Buy buy = new Buy();
	 	BuyProxy buyProxy = new BuyProxy(buy);
	 	buyProxy.buyHouse();
	 }
}
