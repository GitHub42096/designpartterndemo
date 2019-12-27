package com.example.designpartterndemo.proxy.dynamicproxy.cglibdynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class CglibProxy implements MethodInterceptor {

	private Object object;

	public CglibProxy(final Object object){
		this.object = object;
	}
	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("看房子....");
		Object result = methodProxy.invoke(object, args);
		System.out.println("付钱，成交！");
		return result;
	}

	public static Object getProxy(Object object) {
		Enhancer enhancer = new Enhancer();
		// 设置需要代理的对象
		enhancer.setSuperclass(object.getClass());
		// 设置代理人
		enhancer.setCallback(new CglibProxy(object));
		return enhancer.create();
	}
}
