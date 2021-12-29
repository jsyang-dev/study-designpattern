package me.study.designpattern.singleton;

import java.io.IOException;

public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() {
        try {
            if (1 == 0) {
                throw new IOException();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static Settings3 getInstance() {
        return INSTANCE;
    }
}
