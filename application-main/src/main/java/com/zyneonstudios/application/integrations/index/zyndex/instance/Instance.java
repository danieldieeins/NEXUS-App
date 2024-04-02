package com.zyneonstudios.application.integrations.index.zyndex.instance;

import java.io.File;

public interface Instance {

    default File getFile() {
        return null;
    }

    default String getPath() {
        return null;
    }

    default InstanceSettings getSettings() {
        return null;
    }

    default void setSettings(InstanceSettings settings) {

    }
}