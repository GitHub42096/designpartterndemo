package com.example.designpartterndemo.singleton;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton(){};

	public static HungrySingleton getInstance(){
		return instance;
	}

	 public static void main(String[] args){
		HungrySingleton hungrySingleton = getInstance();
		System.out.println(hungrySingleton);
	}
}
