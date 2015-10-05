package com.tomcat.running;

import org.apache.catalina.startup.Bootstrap;

public class TestRuner {

	public static void main(String args[]) {
		Bootstrap bootstarp = new Bootstrap();
		try {
			bootstarp.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
