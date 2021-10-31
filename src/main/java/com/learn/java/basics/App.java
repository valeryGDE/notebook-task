package com.learn.java.basics;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        Note noteAboutCats = new Note("I love cats");
        Note noteAboutJava = new Note("I love Java", new Date());

        Notebook notebook = new Notebook();

        notebook.add(noteAboutCats);
        notebook.add(noteAboutJava);
        System.out.println(notebook);

        notebook.remove(noteAboutCats);
        System.out.println(notebook);

        notebook.editNote(noteAboutJava, "Edited note", new Date());
        System.out.println(notebook);

    }
}
