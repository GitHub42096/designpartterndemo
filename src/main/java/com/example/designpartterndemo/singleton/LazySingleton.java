package com.example.designpartterndemo.singleton;

/**
 * @author zhangjie [zhangjie02@yinhai.com]
 */
public class LazySingleton {

		private static LazySingleton instance;
		private LazySingleton (){}

		public static synchronized LazySingleton getInstance() {
			if (instance == null) {
				instance = new LazySingleton();
			}
			return instance;
		}


		 public static void main(String[] args){
			LazySingleton lazySingleton = LazySingleton.getInstance();
			System.out.println(lazySingleton);
		}
}
