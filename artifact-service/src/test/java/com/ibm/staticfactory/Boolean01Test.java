package com.ibm.staticfactory;

import java.util.Set;

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
		// Fourth advantage : 
		Object enumObject01 = EnumSet01.noneOf(RegularEnumSet01.class);
		Assert.assertEquals(RegularEnumSet01.class, enumObject01.getClass());
		Object enumObject02 = EnumSet01.noneOf(JumboEnumSet01.class);
		Assert.assertEquals(JumboEnumSet01.class, enumObject02.getClass());
		// Fifth advantage : Service Provider Framework Pattern
		// - Service Interface = Implémentation du service
		// - Provider Registration API : Le provider l'utilise pour enregistrer les implémentations
		// - Service Access API : Le client l'utilise pour obtenir des instances du service
		// - Service Provider Interface (optionnal) : Objet factory utilisé pour obtenir des instances  
		Driver01 d = new Driver01();
		ServiceProviderManager01.registerDriver(d);
		Assert.assertEquals(1, ServiceProviderManager01.getRegistereddrivers().size());
		
		// Some common names for static factory methods
		// From : A type-conversion method that takes a single parameter and returns a corresponding instance of this type
		Boolean b4 = Boolean01.from(true);
		// of : An aggregation method that takes multiple parameters and returns an instance of this type that incorporates them
		Set<Boolean> setBoolean = Boolean01.of(true, false,true);
		
		// Print
		System.out.println("India HashCode : "+ ind.hashCode());
		System.out.println("France HashCode : "+ fr.hashCode());
		System.out.println("France 2 HashCode : "+ fr2.hashCode());
		System.out.println("ind == fr2 : "+ ind.equals(fr2));
		Assert.assertEquals(Boolean.TRUE, b1);
		Assert.assertEquals(Boolean.FALSE, b2);
		Assert.assertEquals(Boolean.FALSE, b3);
		Assert.assertEquals(Boolean.TRUE, b4);
		Assert.assertEquals(2, setBoolean.size());
		
		System.out.println("****** Fin du test booleanValueOf ******* ");
	}
}
