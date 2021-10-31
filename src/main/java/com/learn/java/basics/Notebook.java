package com.learn.java.basics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook(){
        notes = new ArrayList<Note>();
    }

    public void add(Note note) {
        notes.add(note);
    }

    public void remove(Note note) {
        notes.remove(note);
    }

    public void editNote(Note note, String context, Date date) {
        notes.set(notes.indexOf(note), new Note(context, date));
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
