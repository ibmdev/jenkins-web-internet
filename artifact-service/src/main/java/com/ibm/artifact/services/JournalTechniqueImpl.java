package com.ibm.artifact.services;

import com.ibm.artifact.annotations.JournalisationTechnique;

public class JournalTechniqueImpl implements IJournalTechnique {

	@JournalisationTechnique(isActive=true)
	public int myService() {
		System.out.println("Appel service myService");
		return 0;
	}

}
