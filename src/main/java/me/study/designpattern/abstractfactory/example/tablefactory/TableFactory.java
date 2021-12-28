package me.study.designpattern.abstractfactory.example.tablefactory;

import me.study.designpattern.abstractfactory.example.factory.Factory;
import me.study.designpattern.abstractfactory.example.factory.Link;
import me.study.designpattern.abstractfactory.example.factory.Page;
import me.study.designpattern.abstractfactory.example.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
