package com.learn.java.basic;

import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Note noteAboutCats = new Note("I love cats");
        Note noteAboutJava = new Note("I love Java", new Date());
        Note noteAboutLearningJava = new Note("You should learn Java", new Date());

        Notebook notebook = NotebookProvider.getNotebookInstance().getNoteBook(0);

        notebook.add(noteAboutCats);
        notebook.add(noteAboutJava);
        notebook.add(noteAboutLearningJava);
        System.out.println(notebook);

        List<Note> notesFoundByContext = notebook.searchByContext("Java");
        System.out.println("Search results by context:" + notesFoundByContext.toString());

        List<Note> notesFoundByDate = notebook.searchByDate("Nov");
        System.out.println("Search results bu date:" + notesFoundByDate);


        notebook.remove(noteAboutCats);
        System.out.println(notebook);

        notebook.editNote(noteAboutJava, "Edited note", new Date());
        System.out.println(notebook);

    }
}
