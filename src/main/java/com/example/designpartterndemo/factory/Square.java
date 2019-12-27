package com.example.designpartterndemo.factory;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
