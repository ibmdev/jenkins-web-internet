package com.ibm.staticfactory;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.staticfactory.Boolean01;
import com.ibm.staticfactory.IBoolean01;

public class Boolean01Test {
	
	@Test
	public void booleanValueOf() {
		System.out.println("****** Début du test booleanValueOf ******* ");
		Boolean b1 = Boolean01.valueOf(true);
		Boolean b2 = Boolean01.valueOf(false);
		Boolean b3 = IBoolean01.valueOf(false);
		System.out.println("HashCode B1 : "+ b1.hashCode());
		System.out.println("HashCode B2 : "+ b2.hashCode());
		System.out.println("HashCode B3 : "+ b3.hashCode());
		String ind = new String("India");
		String fr = new String("France");
		String fr2 = new String("France");
		System.out.println("India HashCode : "+ ind.hashCode());
		System.out.println("France HashCode : "+ fr.hashCode());
		System.out.println("France 2 HashCode : "+ fr2.hashCode());
		System.out.println("ind == fr2 : "+ ind.equals(fr2));
		Assert.assertEquals(Boolean.TRUE, b1);
		Assert.assertEquals(Boolean.FALSE, b2);
		Assert.assertEquals(Boolean.FALSE, b3);
		System.out.println("****** Fin du test booleanValueOf ******* ");
	}
}
