package com.map;

import java.util.Enumeration;
import java.util.Properties;

public class propertiesTest {

	public static void main(String[] args) {

		// k, v

		Properties prop = new Properties();

		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");

		// System.out.println(prop.getProperty("timeout"));

		// Enumeration
		Enumeration e = prop.propertyNames(); // key 값을 반환

		while (e.hasMoreElements()) {
			String element = (String) e.nextElement(); // nextElement의 반환타입 : object
			System.out.println(element + " : " + prop.getProperty(element));
		}
	}

}
