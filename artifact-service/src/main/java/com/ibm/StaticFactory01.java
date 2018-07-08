package com.ibm;

public class StaticFactory01 {
	
	// On définit le constructeur comme privé et non instanciable pour obliger à utiliser 
	// les méthodes de fabrication
	private StaticFactory01() {throw new UnsupportedOperationException();}
	
	// Avantages à utiliser des méthodes factory statique à la place des constructeurs
	// 1) Possibilité de personnaliser les noms des méthodes, meilleure compréhension pour le développeur
	// 2) Il n'est pas nécessaire de créer à chaque fois une nouvelle instance de l'objet
	public static Boolean valueOf(boolean b) {
		return b? Boolean.TRUE: Boolean.FALSE;
	}
}
