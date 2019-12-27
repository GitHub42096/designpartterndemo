package com.example.designpartterndemo.factory;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
