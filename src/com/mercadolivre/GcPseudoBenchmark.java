package com.mercadolivre;

import java.util.ArrayList;
import java.util.List;

public class GcPseudoBenchmark {
    static List<Object> l;

    /**
     *
     *-Xms4G -Xmx8G -XX:StartFlightRecording=disk=true,dumponexit=true,filename=G1.jfr,maxsize=1024m,settings=profile
     *-XX:+UnlockExperimentalVMOptions -XX:+UseZGC -Xms4G -Xmx8G -XX:StartFlightRecording=disk=true,dumponexit=true,filename=ZGC.jfr,maxsize=1024m,settings=profile
     *
     *
     * -XX:+UnlockExperimentalVMOptions -XX:+UseShenandoahGC -Xms4G -Xmx8G -XX:StartFlightRecording=disk=true,dumponexit=true,filename=Shenandoah.jfr,maxsize=1024m,settings=profile
     * time java -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -Xms4G -Xmx8G -XX:StartFlightRecording=disk=true,dumponexit=true,filename=ZGC.jfr,maxsize=1024m,settings=profile GcPseudoBenchmark.java
     */

    public static void main(String[] args) {
        l = new ArrayList<>();
        for (int c = 0; c <200_000_000; c++){
            l.add(new Object());
        }
    }
}
