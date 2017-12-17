package com.ibm.artifact;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created on 17/12/2017.
 */
public class ArtifactTest {

    Logger junitLogFile = Logger.getLogger("junitLogFile");

    @Test
    public void init() {
        junitLogFile.info("ArtifactTest");
    }


}
