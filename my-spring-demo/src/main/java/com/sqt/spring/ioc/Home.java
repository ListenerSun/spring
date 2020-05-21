package com.sqt.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-03-23 18:08
 */
public class Home {
	@Autowired
	private MyApplicationAware myApplicationAware;

	public MyApplicationAware getMyApplicationAware() {
		return myApplicationAware;
	}
}
