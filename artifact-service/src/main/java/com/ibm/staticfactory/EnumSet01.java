package com.ibm.staticfactory;

public abstract class EnumSet01<E> implements Cloneable {
	
	Class<E> elementType;
	
	public static  <E extends Object> Object noneOf(Class<E> elementType) {
		
		if(RegularEnumSet01.class.isAssignableFrom(elementType)) {
			return new RegularEnumSet01();
		}
		else {
			return new JumboEnumSet01();
		}
		
		
	}
}
