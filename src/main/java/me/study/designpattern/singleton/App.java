package me.study.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        구현방법1();
        구현방법2();
        구현방법3();
        구현방법4();
        구현방법5();
        구현깨트리는방법1();
        구현깨트리는방법2();
        구현방법6();
    }

    private static void 구현방법1() {
        Settings1 settings = Settings1.getInstance();
        Settings1 settings1 = Settings1.getInstance();
        System.out.println("구현방법1: " + (settings == settings1));
    }

    private static void 구현방법2() {
        Settings2 settings = Settings2.getInstance();
        Settings2 settings1 = Settings2.getInstance();
        System.out.println("구현방법2: " + (settings == settings1));
    }

    private static void 구현방법3() {
        Settings3 settings = Settings3.getInstance();
        Settings3 settings1 = Settings3.getInstance();
        System.out.println("구현방법3: " + (settings == settings1));
    }

    private static void 구현방법4() {
        Settings4 settings = Settings4.getInstance();
        Settings4 settings1 = Settings4.getInstance();
        System.out.println("구현방법4: " + (settings == settings1));
    }

    private static void 구현방법5() {
        Settings5 settings = Settings5.getInstance();
        Settings5 settings1 = Settings5.getInstance();
        System.out.println("구현방법5: " + (settings == settings1));
    }

    private static void 구현깨트리는방법1() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Settings5 settings = Settings5.getInstance();

        Constructor<Settings5> declaredConstructor = Settings5.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings5 settings1 = declaredConstructor.newInstance();

        System.out.println("구현깨트리는방법1: " + (settings == settings1));
    }

    private static void 구현깨트리는방법2() throws IOException, ClassNotFoundException {
        Settings5 settings = Settings5.getInstance();
        Settings5 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println("구현깨트리는방법2: " + (settings == settings1));
    }

    private static void 구현방법6() {
        Settings6 settings = Settings6.INSTANCE;
        Settings6 settings1 = Settings6.INSTANCE;
        System.out.println("구현방법6: " + (settings == settings1));
    }
}
