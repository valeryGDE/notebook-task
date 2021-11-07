package com.learn.java.basic;

import java.util.ArrayList;
import java.util.List;

public class NotebookProvider {
    private static final NotebookProvider notebookInstance = new NotebookProvider();

    private List<Notebook> notebooks = new ArrayList<Notebook>();

    private NotebookProvider() {
        notebooks.add(new Notebook());
    }

    public Notebook getNoteBook(int index) {
        if (index >= notebooks.size()) {
            throw new RuntimeException("No such notebook");
        }
        return notebooks.get(index);
    }

    public static NotebookProvider getNotebookInstance() {
        return notebookInstance;
    }

    public void createNoteBook() {
        Notebook notebook = new Notebook();
        notebooks.add(notebook);
    }
}
