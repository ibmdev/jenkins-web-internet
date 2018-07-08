package com.ibm;

public interface IStaticFactory01 {
	
	public static Boolean valueOf(boolean b) {return b? Boolean.TRUE: Boolean.FALSE;}

}
