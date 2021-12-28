package me.study.designpattern.abstractfactory.example.listfactory;

import me.study.designpattern.abstractfactory.example.factory.Factory;
import me.study.designpattern.abstractfactory.example.factory.Link;
import me.study.designpattern.abstractfactory.example.factory.Page;
import me.study.designpattern.abstractfactory.example.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
