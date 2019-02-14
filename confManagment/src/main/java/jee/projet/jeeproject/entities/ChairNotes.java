/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ADADI
 */
@Entity
public class ChairNotes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private int id;

    @Column(name = "note", length = 11, nullable = false)
    private float note;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Chair chair;

    @ManyToOne
    @JoinColumn(name = "submission_id", nullable = false, insertable = false, updatable = false)
    private Submission submission;

    public ChairNotes() {
    }

    public ChairNotes(int id, float note, Chair chair, Submission submission) {
        this.id = id;
        this.note = note;
        this.chair = chair;
        this.submission = submission;
    }

    public ChairNotes(float note, Chair chair) {
        this.note = note;
        this.chair = chair;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChairNotes other = (ChairNotes) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChairNotes{" + "id=" + id + ", note=" + note + ", chair=" + chair + ", submission=" + submission + '}';
    }

}
