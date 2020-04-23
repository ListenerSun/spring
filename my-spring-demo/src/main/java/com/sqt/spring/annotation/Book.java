package com.sqt.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-23 14:38
 */
@Component
public class Book {

	String name = "Chinese";
	int price = 20;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
