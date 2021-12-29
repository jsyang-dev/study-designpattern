package me.study.designpattern.adapter.q1;

import java.io.IOException;

/**
 * Properties Ŭ������ ����ϴ� Adapter ���� ����
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2000");
            f.setValue("month", "11");
            f.setValue("day", "20");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}