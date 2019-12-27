package com.example.designpartterndemo.proxy.dynamicproxy.cglibdynamicproxy;

import com.example.designpartterndemo.proxy.Buy;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class MainTest {

	 public static void main(String[] args){

		 // 生成 Cglib 代理类
		 Buy buyProxy = (Buy) CglibProxy.getProxy(new Buy());
		 // 调用相关方法
		 buyProxy.buyHouse();
	 }
}
