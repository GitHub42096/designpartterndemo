package com.example.designpartterndemo.observer;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public abstract class Observer {

	protected Subject subject;

	public abstract void update();
}
