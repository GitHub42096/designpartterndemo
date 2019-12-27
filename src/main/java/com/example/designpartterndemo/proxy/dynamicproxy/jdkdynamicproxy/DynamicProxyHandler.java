package com.example.designpartterndemo.proxy.dynamicproxy.jdkdynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class DynamicProxyHandler implements InvocationHandler {

	private Object object;

	public DynamicProxyHandler(final Object object){
		this.object = object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("看房子....");
		Object result = method.invoke(object, args);
		System.out.println("付钱，成交！");
		return result;
	}
}
