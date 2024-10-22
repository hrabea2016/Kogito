package org.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("KieSession2");
            
            kSession.insert(new Person("P1", 17, false));
            kSession.insert(new Person("P2", 22, true));
            kSession.insert(new Person("P3", 26, true));
            kSession.insert(new Person("P4", 27, true));
            kSession.insert(new Person("P5", 30, true));
            
            kSession.startProcess("BPMN_MAIN_PROCESS");
            

            kSession.fireAllRules();
            kSession.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}