package me.study.designpattern.singleton;

public class Settings4 {

    private static volatile Settings4 instance;

    private Settings4() {
    }

    public static Settings4 getInstance() {
        if (instance == null) {
            synchronized (Settings4.class) {
                if (instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}
