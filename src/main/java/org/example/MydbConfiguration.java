package org.example;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot
public class MydbConfiguration {

    @ConfigItem
    public String invoked;
}
