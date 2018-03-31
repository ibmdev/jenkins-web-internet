package com.ibm.artifact;

import org.apache.log4j.Logger;
import org.junit.Test;
import com.ibm.artifact.handlers.JcmsServiceHandler;
import com.ibm.artifact.services.IJournalTechnique;
import com.ibm.artifact.services.JournalTechniqueImpl;

/**
 * Created on 17/12/2017.
 */
public class ArtifactTest {

    Logger junitLogFile = Logger.getLogger("junitLogFile");

    @Test
    public void testHandler() {
    	
    	IJournalTechnique o = JcmsServiceHandler.getProxy(new JournalTechniqueImpl(), IJournalTechnique.class);
        int resultat = o.myService();
        System.out.println("Résultat : " + resultat);
    }


}
