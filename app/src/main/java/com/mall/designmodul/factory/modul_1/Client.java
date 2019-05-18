package com.mall.designmodul.factory.modul_1;


public class Client {

	public static void main(String[] args) {
		Api obj = Factory.create(2);
		obj = Factory.create(3);
	}

}
