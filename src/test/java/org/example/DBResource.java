package org.example;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.HashMap;
import java.util.Map;

public class DBResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        System.err.println("################## db resource invoked");
        HashMap<String, String> config = new HashMap<>();
        config.put("quarkus.mydb.invoked", "true");
        return config;
    }


    @Override
    public void stop() {

    }
}
