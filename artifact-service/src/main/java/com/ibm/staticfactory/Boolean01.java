package com.ibm.staticfactory;

import java.util.HashSet;
import java.util.Set;

public class Boolean01 {
	
	
	
	
	// On définit le constructeur comme privé et non instanciable pour obliger à utiliser 
	// les méthodes de fabrication
	private Boolean01() {throw new UnsupportedOperationException();}
	
	// Avantages à utiliser des méthodes factory statique à la place des constructeurs
	// 1) Possibilité de personnaliser les noms des méthodes, meilleure compréhension pour le développeur
	// 2) Il n'est pas nécessaire de créer à chaque fois une nouvelle instance de l'objet
	public static Boolean valueOf(boolean b) {
		return b? Boolean.TRUE: Boolean.FALSE;
	}
	// Some common names for static factory methods
	public static Boolean from(boolean b) {
		return valueOf(b);
	}
	
	public static Set<Boolean> of(boolean...p) {
		Set<Boolean> setBoolean = new HashSet<>();
		for(boolean b:p) {
			setBoolean.add(from(b));
		}
		return setBoolean;
		
	}
	
}
