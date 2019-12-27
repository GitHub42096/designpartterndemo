package com.example.designpartterndemo.factory;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
