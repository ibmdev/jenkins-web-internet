package com.ibm.staticfactory;

import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceProviderManager01 {
	
	 private final static CopyOnWriteArrayList<Driver01> registeredDrivers = new CopyOnWriteArrayList<>();
	   
	 public static CopyOnWriteArrayList<Driver01> getRegistereddrivers() {
		return registeredDrivers;
	}

	public static void registerDriver(Driver01 d) {
		 if(d!=null) {
			 registeredDrivers.addIfAbsent(d);
		 }
		 else {
			 throw new NullPointerException();
		 }
	 }
}
