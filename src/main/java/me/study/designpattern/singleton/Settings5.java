package me.study.designpattern.singleton;

import java.io.Serializable;

public class Settings5 implements Serializable {

    private Settings5() {
    }

    public static Settings5 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    private static class SettingsHolder {
        private static final Settings5 INSTANCE = new Settings5();
    }
}
