package com.learn.java.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
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

    public List<Note> searchByContext(String searchContext) {
        List<Note> notesResult = new ArrayList<Note>();
        for (Note note : notes) {
            if (note.toString().contains(searchContext)) {
                notesResult.add(note);
            }
        }
        return notesResult;
    }

    public List<Note> searchByDate(String date) {
        List<Note> notesResult = new ArrayList<Note>();
        for (Note note : notes) {
            try {
                if (note.getDate().toString().contains(date)) {
                    notesResult.add(note);
                }
            } catch (Exception e) {
            }
        }
        return notesResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(notes, notebook.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
