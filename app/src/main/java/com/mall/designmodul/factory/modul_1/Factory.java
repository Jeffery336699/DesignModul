package com.mall.designmodul.factory.modul_1;

public class Factory {

	public static Api create(int type){
		switch (type) {
		case 1:
			return new ImplA();
		case 2:
			return new ImplB();
		case 3:
			return new ImplC();	
		default:
			return new ImplC();
		}
	}
	
}
